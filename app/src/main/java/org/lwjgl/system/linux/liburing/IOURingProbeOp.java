package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp.class */
@org.lwjgl.system.NativeType("struct io_uring_probe_op")
public class IOURingProbeOp extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingProbeOp> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int OP = 0;
    public static final int RESV = 0;
    public static final int FLAGS = 0;
    public static final int RESV2 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingProbeOp$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingProbeOp, org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingProbeOp ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingProbeOp getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte op() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.nop(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u8")
        public byte resv() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.nresv(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u16")
        public short flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int resv2() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.nresv2(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer op(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbeOp.nop(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer resv(@org.lwjgl.system.NativeType("__u8") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbeOp.nresv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer flags(@org.lwjgl.system.NativeType("__u16") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbeOp.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer resv2(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingProbeOp.nresv2(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.create(r0)
                org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingProbeOp(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingProbeOp create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingProbeOp(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte op() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nop(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u8")
    public byte resv() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nresv(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u16")
    public short flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int resv2() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nresv2(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbeOp op(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nop(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbeOp resv(@org.lwjgl.system.NativeType("__u8") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbeOp flags(@org.lwjgl.system.NativeType("__u16") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbeOp resv2(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresv2(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbeOp set(byte r4, byte r5, short r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = r0.op(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = r0.resv(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = r0.flags(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = r0.resv2(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingProbeOp set(org.lwjgl.system.linux.liburing.IOURingProbeOp r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp malloc() {
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp calloc() {
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingProbeOp createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingProbeOp.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingProbeOp$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nop(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.OP
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nresv(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static int nresv2(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nop(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.OP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nresv(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.RESV
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nflags(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nresv2(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingProbeOp.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingProbeOp.RESV2
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.linux.liburing.IOURingProbeOp r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
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
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingProbeOp.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingProbeOp.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbeOp.OP = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbeOp.RESV = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbeOp.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingProbeOp.RESV2 = r0
            return
    }
}
