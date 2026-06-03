package org.lwjgl.system.windows;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/TOUCHINPUT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/TOUCHINPUT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/TOUCHINPUT.class */
public class TOUCHINPUT extends org.lwjgl.system.Struct<org.lwjgl.system.windows.TOUCHINPUT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int X = 0;
    public static final int Y = 0;
    public static final int HSOURCE = 0;
    public static final int DWID = 0;
    public static final int DWFLAGS = 0;
    public static final int DWMASK = 0;
    public static final int DWTIME = 0;
    public static final int DWEXTRAINFO = 0;
    public static final int CXCONTACT = 0;
    public static final int CYCONTACT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/TOUCHINPUT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/TOUCHINPUT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/windows/TOUCHINPUT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.windows.TOUCHINPUT, org.lwjgl.system.windows.TOUCHINPUT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.windows.TOUCHINPUT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
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
        protected org.lwjgl.system.windows.TOUCHINPUT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.windows.TOUCHINPUT getElementFactory() {
                r2 = this;
                org.lwjgl.system.windows.TOUCHINPUT r0 = org.lwjgl.system.windows.TOUCHINPUT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("LONG")
        public int x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.nx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("LONG")
        public int y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ny(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("HANDLE")
        public long hSource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.TOUCHINPUT.nhSource(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ndwID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ndwFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ndwMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int dwTime() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ndwTime(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("ULONG_PTR")
        public long dwExtraInfo() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.windows.TOUCHINPUT.ndwExtraInfo(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int cxContact() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ncxContact(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("DWORD")
        public int cyContact() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.windows.TOUCHINPUT.ncyContact(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.TOUCHINPUT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.windows.TOUCHINPUT r0 = org.lwjgl.system.windows.TOUCHINPUT.create(r0)
                org.lwjgl.system.windows.TOUCHINPUT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TOUCHINPUT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.windows.TOUCHINPUT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TOUCHINPUT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("LONG")
    public int x() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("LONG")
    public int y() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("HANDLE")
    public long hSource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nhSource(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int dwTime() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndwTime(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ULONG_PTR")
    public long dwExtraInfo() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndwExtraInfo(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int cxContact() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncxContact(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("DWORD")
    public int cyContact() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncyContact(r0)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT malloc() {
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            int r2 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT calloc() {
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT create() {
            int r0 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT create(long r6) {
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.TOUCHINPUT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer malloc(int r6) {
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer calloc(int r7) {
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
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

    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer create(long r6, int r8) {
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.TOUCHINPUT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.TOUCHINPUT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.TOUCHINPUT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.windows.TOUCHINPUT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.ALIGNOF
            int r4 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.windows.TOUCHINPUT r0 = new org.lwjgl.system.windows.TOUCHINPUT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.windows.TOUCHINPUT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.windows.TOUCHINPUT$Buffer r0 = new org.lwjgl.system.windows.TOUCHINPUT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.windows.TOUCHINPUT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.X
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nhSource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.TOUCHINPUT.HSOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndwID(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.DWID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndwFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.DWFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndwMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.DWMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndwTime(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.DWTIME
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndwExtraInfo(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.windows.TOUCHINPUT.DWEXTRAINFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ncxContact(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.CXCONTACT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncyContact(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.windows.TOUCHINPUT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.CYCONTACT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.windows.TOUCHINPUT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.POINTER_SIZE
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
            int r3 = org.lwjgl.system.windows.TOUCHINPUT.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.windows.TOUCHINPUT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.windows.TOUCHINPUT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.X = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.Y = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.HSOURCE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.DWID = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.DWFLAGS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.DWMASK = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.DWTIME = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.DWEXTRAINFO = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.CXCONTACT = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.windows.TOUCHINPUT.CYCONTACT = r0
            return
    }
}
