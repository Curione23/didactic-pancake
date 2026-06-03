package org.lwjgl.system.linux.liburing;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg.class */
@org.lwjgl.system.NativeType("struct io_uring_getevents_arg")
public class IOURingGeteventsArg extends org.lwjgl.system.Struct<org.lwjgl.system.linux.liburing.IOURingGeteventsArg> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SIGMASK = 0;
    public static final int SIGMASK_SZ = 0;
    public static final int PAD = 0;
    public static final int TS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/liburing/IOURingGeteventsArg$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.liburing.IOURingGeteventsArg, org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.liburing.IOURingGeteventsArg ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
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
        protected org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.liburing.IOURingGeteventsArg getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long sigmask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.nsigmask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int sigmask_sz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.nsigmask_sz(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u32")
        public int pad() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.npad(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("__u64")
        public long ts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.nts(r0)
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer sigmask(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg.nsigmask(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer sigmask_sz(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg.nsigmask_sz(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer pad(@org.lwjgl.system.NativeType("__u32") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg.npad(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer ts(@org.lwjgl.system.NativeType("__u64") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg.nts(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.create(r0)
                org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected IOURingGeteventsArg(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.liburing.IOURingGeteventsArg create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public IOURingGeteventsArg(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long sigmask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsigmask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int sigmask_sz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsigmask_sz(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u32")
    public int pad() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npad(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("__u64")
    public long ts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nts(r0)
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingGeteventsArg sigmask(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsigmask(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingGeteventsArg sigmask_sz(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsigmask_sz(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingGeteventsArg pad(@org.lwjgl.system.NativeType("__u32") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npad(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingGeteventsArg ts(@org.lwjgl.system.NativeType("__u64") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nts(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingGeteventsArg set(long r5, int r7, int r8, long r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = r0.sigmask(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = r0.sigmask_sz(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = r0.pad(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = r0.ts(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.liburing.IOURingGeteventsArg set(org.lwjgl.system.linux.liburing.IOURingGeteventsArg r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg malloc() {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            int r2 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg calloc() {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg create() {
            int r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg create(long r6) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer malloc(int r6) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer calloc(int r7) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
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

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.ALIGNOF
            int r4 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.liburing.IOURingGeteventsArg.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer r0 = new org.lwjgl.system.linux.liburing.IOURingGeteventsArg$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nsigmask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIGMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nsigmask_sz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIGMASK_SZ
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npad(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nts(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.TS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsigmask(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIGMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsigmask_sz(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIGMASK_SZ
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npad(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.PAD
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nts(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.liburing.IOURingGeteventsArg.TS
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
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIGMASK = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg.SIGMASK_SZ = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg.PAD = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.liburing.IOURingGeteventsArg.TS = r0
            return
    }
}
