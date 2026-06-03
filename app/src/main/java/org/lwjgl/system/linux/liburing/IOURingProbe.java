package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbe.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbe.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbe.class */
@org.lwjgl.system.NativeType("struct io_uring_probe")
public class IOURingProbe extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingProbe> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LAST_OP = 0;
    public static final int OPS_LEN = 0;
    public static final int RESV = 0;
    public static final int RESV2 = 0;
    public static final int OPS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbe$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbe$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbe$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingProbe, org.lwjgl.system.linux.liburing.IOURingProbe.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingProbe ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingProbe.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingProbe getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingProbe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte last_op() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingProbe.nlast_op(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte ops_len() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingProbe.nops_len(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short resv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingProbe.nresv(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_probe_op[0]")
        public org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer ops() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = org.lwjgl.system.linux.liburing.IOURingProbe.nops(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("struct io_uring_probe_op")
        public org.lwjgl.system.linux.liburing.IOURingProbeOp ops(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = org.lwjgl.system.linux.liburing.IOURingProbe.nops(r0, r1)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer last_op(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbe.nlast_op(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer ops_len(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbe.nops_len(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer resv(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbe.nresv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer ops(@org.lwjgl.system.NativeType("struct io_uring_probe_op[0]") org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbe.nops(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer ops(int r6, @org.lwjgl.system.NativeType("struct io_uring_probe_op") org.lwjgl.system.linux.liburing.IOURingProbeOp r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.system.linux.liburing.IOURingProbe.nops(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer ops(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r1 = r1.ops()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbe.Buffer ops(int r5, java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingProbeOp> r6) {
                r4 = this;
                r0 = r6
                r1 = r4
                r2 = r5
                org.lwjgl.system.linux.liburing.IOURingProbeOp r1 = r1.ops(r2)
                r0.accept(r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingProbe r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingProbe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.create(r0)
                org.lwjgl.system.linux.liburing.IOURingProbe.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingProbe(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingProbe create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingProbe(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte last_op() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nlast_op(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte ops_len() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nops_len(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short resv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nresv(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_probe_op[0]")
    public org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer ops() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = nops(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("struct io_uring_probe_op")
    public org.lwjgl.system.linux.liburing.IOURingProbeOp ops(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = nops(r0, r1)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe last_op(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlast_op(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe ops_len(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nops_len(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe resv(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe ops(@org.lwjgl.system.NativeType("struct io_uring_probe_op[0]") org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nops(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe ops(int r6, @org.lwjgl.system.NativeType("struct io_uring_probe_op") org.lwjgl.system.linux.liburing.IOURingProbeOp r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nops(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe ops(java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r1 = r1.ops()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe ops(int r5, java.util.function.Consumer<org.lwjgl.system.linux.liburing.IOURingProbeOp> r6) {
            r4 = this;
            r0 = r6
            r1 = r4
            r2 = r5
            org.lwjgl.system.linux.liburing.IOURingProbeOp r1 = r1.ops(r2)
            r0.accept(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe set(byte r4, byte r5, short r6, org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = r0.last_op(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = r0.ops_len(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = r0.resv(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = r0.ops(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbe set(org.lwjgl.system.linux.liburing.IOURingProbe r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe malloc() {
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe calloc() {
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingProbe createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = new org.lwjgl.system.linux.liburing.IOURingProbe
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbe.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingProbe$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbe$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nlast_op(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.LAST_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nops_len(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.OPS_LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nresv(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nresv2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingProbe.RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nresv2(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer nops(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingProbe.OPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 0
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.create(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp nops(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.system.linux.liburing.IOURingProbe.OPS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 0
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.create(r0)
            return r0
    }

    public static void nlast_op(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.LAST_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nops_len(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.OPS_LEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nresv(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nresv2(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 3
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbe.RESV2
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nresv2(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbe.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbe.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 3
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nops(long r7, org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 0
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbe.OPS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nops(long r9, int r11, org.lwjgl.system.linux.liburing.IOURingProbeOp r12) {
            r0 = r12
            long r0 = r0.address()
            r1 = r9
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbe.OPS
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r11
            r3 = 0
            long r2 = org.lwjgl.system.Checks.check(r2, r3)
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r3 = (long) r3
            long r2 = r2 * r3
            long r1 = r1 + r2
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingProbe r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingProbeOp.ALIGNOF
            r5 = 0
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4, r5)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingProbe.SIZEOF = r0
            r0 = r7
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingProbe.ALIGNOF = r0
            r0 = r7
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbe.LAST_OP = r0
            r0 = r7
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbe.OPS_LEN = r0
            r0 = r7
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbe.RESV = r0
            r0 = r7
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbe.RESV2 = r0
            r0 = r7
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbe.OPS = r0
            return
    }
}
