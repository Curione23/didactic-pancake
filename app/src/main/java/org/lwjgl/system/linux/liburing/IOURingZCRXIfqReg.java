package org.lwjgl.system.linux.liburing;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingZCRXIfqReg.class */
@org.lwjgl.system.NativeType("struct io_uring_zcrx_ifq_reg")
public class IOURingZCRXIfqReg extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int IF_IDX = 0;
    public static final int IF_RXQ = 0;
    public static final int RQ_ENTRIES = 0;
    public static final int FLAGS = 0;
    public static final int AREA_PTR = 0;
    public static final int REGION_PTR = 0;
    public static final int OFFSETS = 0;
    public static final int ZCRX_ID = 0;
    public static final int __RESV2 = 0;
    public static final int __RESV = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingZCRXIfqReg$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg, org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
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
        protected org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int if_idx() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nif_idx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int if_rxq() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nif_rxq(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int rq_entries() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nrq_entries(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long area_ptr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.narea_ptr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long region_ptr() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nregion_ptr(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_zcrx_offsets")
        public org.lwjgl.system.linux.liburing.IOURingZCRXOffsets offsets() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.noffsets(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int zcrx_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nzcrx_id(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer if_idx(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nif_idx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer if_rxq(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nif_rxq(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer rq_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nrq_entries(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer flags(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer area_ptr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.narea_ptr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer region_ptr(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nregion_ptr(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer offsets(@org.lwjgl.system.NativeType("struct io_uring_zcrx_offsets") org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.noffsets(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer offsets(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingZCRXOffsets> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r1 = r1.offsets()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer zcrx_id(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.nzcrx_id(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3359create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.create(r0)
                org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingZCRXIfqReg(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingZCRXIfqReg(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int if_idx() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nif_idx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int if_rxq() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nif_rxq(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int rq_entries() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrq_entries(r0)
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

    @org.lwjgl.system.NativeType("__u64")
    public long area_ptr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = narea_ptr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long region_ptr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nregion_ptr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_zcrx_offsets")
    public org.lwjgl.system.linux.liburing.IOURingZCRXOffsets offsets() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r0 = noffsets(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int zcrx_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nzcrx_id(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg if_idx(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nif_idx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg if_rxq(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nif_rxq(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg rq_entries(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrq_entries(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg flags(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg area_ptr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            narea_ptr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg region_ptr(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nregion_ptr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg offsets(@org.lwjgl.system.NativeType("struct io_uring_zcrx_offsets") org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffsets(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg offsets(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingZCRXOffsets> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r1 = r1.offsets()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg zcrx_id(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nzcrx_id(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg set(int r5, int r6, int r7, int r8, long r9, long r11, org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r13, int r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.if_idx(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.if_rxq(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.rq_entries(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.area_ptr(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.region_ptr(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.offsets(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.zcrx_id(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg set(org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg malloc() {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg calloc() {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nif_idx(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.IF_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nif_rxq(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.IF_RXQ
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nrq_entries(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.RQ_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long narea_ptr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.AREA_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nregion_ptr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.REGION_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingZCRXOffsets noffsets(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.OFFSETS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r0 = org.lwjgl.system.linux.liburing.IOURingZCRXOffsets.create(r0)
            return r0
    }

    public static int nzcrx_id(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ZCRX_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int n__resv2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.LongBuffer n__resv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBuffer(r0, r1)
            return r0
    }

    public static long n__resv(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 8
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nif_idx(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.IF_IDX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nif_rxq(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.IF_RXQ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nrq_entries(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.RQ_ENTRIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nflags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void narea_ptr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.AREA_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nregion_ptr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.REGION_PTR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void noffsets(long r7, org.lwjgl.system.linux.liburing.IOURingZCRXOffsets r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.OFFSETS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXOffsets.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nzcrx_id(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ZCRX_ID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void n__resv2(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void n__resv(long r7, java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 8
            int r2 = r2 * r3
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void n__resv(long r7, int r9, long r10) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 3
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 8
            long r1 = r1 * r2
            long r0 = r0 + r1
            r1 = r10
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.system.linux.liburing.IOURingZCRXOffsets.SIZEOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingZCRXOffsets.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.IF_IDX = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.IF_RXQ = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.RQ_ENTRIES = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.AREA_PTR = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.REGION_PTR = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.OFFSETS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.ZCRX_ID = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV2 = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingZCRXIfqReg.__RESV = r0
            return
    }
}
