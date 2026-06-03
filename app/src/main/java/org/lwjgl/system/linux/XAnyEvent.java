package org.lwjgl.system.linux;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XAnyEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XAnyEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XAnyEvent.class */
public class XAnyEvent extends org.lwjgl.system.Struct<org.lwjgl.system.linux.XAnyEvent> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int SERIAL = 0;
    public static final int SEND_EVENT = 0;
    public static final int DISPLAY = 0;
    public static final int WINDOW = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XAnyEvent$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XAnyEvent$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/linux/XAnyEvent$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.linux.XAnyEvent, org.lwjgl.system.linux.XAnyEvent.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.linux.XAnyEvent ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
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
        protected org.lwjgl.system.linux.XAnyEvent.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.linux.XAnyEvent getElementFactory() {
                r2 = this;
                org.lwjgl.system.linux.XAnyEvent r0 = org.lwjgl.system.linux.XAnyEvent.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XAnyEvent.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long serial() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XAnyEvent.nserial(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Bool")
        public boolean send_event() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.linux.XAnyEvent.nsend_event(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("Display *")
        public long display() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XAnyEvent.ndisplay(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("Window")
        public long window() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.linux.XAnyEvent.nwindow(r0)
                return r0
        }

        public org.lwjgl.system.linux.XAnyEvent.Buffer type(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.linux.XAnyEvent.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XAnyEvent.Buffer serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XAnyEvent.nserial(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XAnyEvent.Buffer send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.system.linux.XAnyEvent.nsend_event(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.linux.XAnyEvent.Buffer display(@org.lwjgl.system.NativeType("Display *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XAnyEvent.ndisplay(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.linux.XAnyEvent.Buffer window(@org.lwjgl.system.NativeType("Window") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.linux.XAnyEvent.nwindow(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XAnyEvent r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.linux.XAnyEvent$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.linux.XAnyEvent r0 = org.lwjgl.system.linux.XAnyEvent.create(r0)
                org.lwjgl.system.linux.XAnyEvent.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected XAnyEvent(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.linux.XAnyEvent create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public XAnyEvent(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            return r0
    }

    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long serial() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nserial(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public boolean send_event() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsend_event(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("Display *")
    public long display() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndisplay(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("Window")
    public long window() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nwindow(r0)
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent type(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent serial(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nserial(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent send_event(@org.lwjgl.system.NativeType("Bool") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nsend_event(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent display(@org.lwjgl.system.NativeType("Display *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndisplay(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent window(@org.lwjgl.system.NativeType("Window") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nwindow(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent set(int r5, long r6, boolean r8, long r9, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.linux.XAnyEvent r0 = r0.type(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.system.linux.XAnyEvent r0 = r0.serial(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.linux.XAnyEvent r0 = r0.send_event(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.linux.XAnyEvent r0 = r0.display(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.system.linux.XAnyEvent r0 = r0.window(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.linux.XAnyEvent set(org.lwjgl.system.linux.XAnyEvent r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent malloc() {
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            int r2 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent calloc() {
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent create() {
            int r0 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent create(long r6) {
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XAnyEvent createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent.Buffer malloc(int r6) {
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent.Buffer calloc(int r7) {
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
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

    public static org.lwjgl.system.linux.XAnyEvent.Buffer create(long r6, int r8) {
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.linux.XAnyEvent.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XAnyEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XAnyEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XAnyEvent r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.linux.XAnyEvent r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.linux.XAnyEvent.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.linux.XAnyEvent.ALIGNOF
            int r4 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.linux.XAnyEvent r0 = new org.lwjgl.system.linux.XAnyEvent
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XAnyEvent.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XAnyEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.linux.XAnyEvent.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.linux.XAnyEvent$Buffer r0 = new org.lwjgl.system.linux.XAnyEvent$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.linux.XAnyEvent.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.linux.XAnyEvent.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XAnyEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XAnyEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nserial(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsend_event(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XAnyEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XAnyEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndisplay(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nwindow(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XAnyEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XAnyEvent.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nserial(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.SERIAL
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nsend_event(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.linux.XAnyEvent.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.linux.XAnyEvent.SEND_EVENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndisplay(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.DISPLAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nwindow(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.WINDOW
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.linux.XAnyEvent.DISPLAY
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
            org.lwjgl.system.linux.XAnyEvent r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.linux.XAnyEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.linux.XAnyEvent.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.system.linux.XAnyEvent.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.linux.XAnyEvent.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.linux.XAnyEvent.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XAnyEvent.TYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XAnyEvent.SERIAL = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XAnyEvent.SEND_EVENT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XAnyEvent.DISPLAY = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.linux.XAnyEvent.WINDOW = r0
            return
    }
}
