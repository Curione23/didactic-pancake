package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingRestriction.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingRestriction.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingRestriction.class */
@org.lwjgl.system.NativeType("struct io_uring_restriction")
public class IOURingRestriction extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingRestriction> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int OPCODE = 0;
    public static final int REGISTER_OP = 0;
    public static final int SQE_OP = 0;
    public static final int SQE_FLAGS = 0;
    public static final int RESV = 0;
    public static final int RESV2 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingRestriction$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingRestriction$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingRestriction$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingRestriction, org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingRestriction ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingRestriction getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingRestriction r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short opcode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.nopcode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte register_op() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.nregister_op(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte sqe_op() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.nsqe_op(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte sqe_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.nsqe_flags(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer opcode(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingRestriction.nopcode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer register_op(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingRestriction.nregister_op(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer sqe_op(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingRestriction.nsqe_op(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer sqe_flags(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingRestriction.nsqe_flags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingRestriction r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingRestriction r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.create(r0)
                org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingRestriction(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingRestriction create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingRestriction(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short opcode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nopcode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte register_op() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nregister_op(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte sqe_op() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsqe_op(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte sqe_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nsqe_flags(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingRestriction opcode(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopcode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingRestriction register_op(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nregister_op(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingRestriction sqe_op(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsqe_op(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingRestriction sqe_flags(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsqe_flags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingRestriction set(org.lwjgl.system.linux.liburing.IOURingRestriction r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction malloc() {
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction calloc() {
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingRestriction createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingRestriction.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingRestriction$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static short nopcode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.OPCODE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nregister_op(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.REGISTER_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsqe_op(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SQE_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nsqe_flags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SQE_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nresv(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.IntBuffer nresv2(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.liburing.IOURingRestriction.RESV2
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 3
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nresv2(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.RESV2
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

    public static void nopcode(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.OPCODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nregister_op(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.REGISTER_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsqe_op(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SQE_OP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nsqe_flags(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.SQE_FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nresv(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
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
            int r2 = org.lwjgl.system.linux.liburing.IOURingRestriction.RESV2
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
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingRestriction.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.system.linux.liburing.IOURingRestriction.RESV2
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

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingRestriction r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 3
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 1
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 1
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 1
            org.lwjgl.system.Struct$Member r6 = __member(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            r4 = 3
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r8 = r0
            r0 = r8
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingRestriction.SIZEOF = r0
            r0 = r8
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingRestriction.ALIGNOF = r0
            r0 = r8
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingRestriction.OPCODE = r0
            r0 = r8
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingRestriction.REGISTER_OP = r0
            r0 = r8
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingRestriction.SQE_OP = r0
            r0 = r8
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingRestriction.SQE_FLAGS = r0
            r0 = r8
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingRestriction.RESV = r0
            r0 = r8
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingRestriction.RESV2 = r0
            return
    }
}
