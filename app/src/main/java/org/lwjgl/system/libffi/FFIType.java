package org.lwjgl.system.libffi;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFIType.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFIType.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFIType.class */
@org.lwjgl.system.NativeType("struct ffi_type")
public class FFIType extends org.lwjgl.system.Struct<org.lwjgl.system.libffi.FFIType> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SIZE = 0;
    public static final int ALIGNMENT = 0;
    public static final int TYPE = 0;
    public static final int ELEMENTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFIType$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFIType$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFIType$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.libffi.FFIType, org.lwjgl.system.libffi.FFIType.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.libffi.FFIType ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.libffi.FFIType.SIZEOF
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
        protected org.lwjgl.system.libffi.FFIType.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.libffi.FFIType getElementFactory() {
                r2 = this;
                org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.system.libffi.FFIType.nsize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned short")
        public short alignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.libffi.FFIType.nalignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned short")
        public short type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.system.libffi.FFIType.ntype(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("ffi_type *")
        public org.lwjgl.PointerBuffer elements(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.system.libffi.FFIType.nelements(r0, r1)
                return r0
        }

        public org.lwjgl.system.libffi.FFIType.Buffer size(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.libffi.FFIType.nsize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.libffi.FFIType.Buffer alignment(@org.lwjgl.system.NativeType("unsigned short") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.libffi.FFIType.nalignment(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.libffi.FFIType.Buffer type(@org.lwjgl.system.NativeType("unsigned short") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.libffi.FFIType.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.system.libffi.FFIType.Buffer elements(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ffi_type *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.system.libffi.FFIType.nelements(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.libffi.FFIType r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.libffi.FFIType$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
                org.lwjgl.system.libffi.FFIType.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FFIType(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.libffi.FFIType create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FFIType(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFIType.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.libffi.FFIType.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned short")
    public short alignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nalignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned short")
    public short type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ntype(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("ffi_type *")
    public org.lwjgl.PointerBuffer elements(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = nelements(r0, r1)
            return r0
    }

    public org.lwjgl.system.libffi.FFIType size(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.libffi.FFIType alignment(@org.lwjgl.system.NativeType("unsigned short") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nalignment(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.libffi.FFIType type(@org.lwjgl.system.NativeType("unsigned short") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.libffi.FFIType elements(@javax.annotation.Nullable @org.lwjgl.system.NativeType("ffi_type *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nelements(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.libffi.FFIType set(long r5, short r7, short r8, @javax.annotation.Nullable org.lwjgl.PointerBuffer r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.libffi.FFIType r0 = r0.size(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.libffi.FFIType r0 = r0.alignment(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.system.libffi.FFIType r0 = r0.type(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.system.libffi.FFIType r0 = r0.elements(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.libffi.FFIType set(org.lwjgl.system.libffi.FFIType r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.libffi.FFIType.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType malloc() {
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            int r2 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType calloc() {
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType create() {
            int r0 = org.lwjgl.system.libffi.FFIType.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType create(long r6) {
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.libffi.FFIType createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType.Buffer malloc(int r6) {
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType.Buffer calloc(int r7) {
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.libffi.FFIType.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
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

    public static org.lwjgl.system.libffi.FFIType.Buffer create(long r6, int r8) {
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.libffi.FFIType.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.libffi.FFIType.ALIGNOF
            int r4 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.libffi.FFIType r0 = new org.lwjgl.system.libffi.FFIType
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFIType.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.libffi.FFIType.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.libffi.FFIType.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.libffi.FFIType$Buffer r0 = new org.lwjgl.system.libffi.FFIType$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.libffi.FFIType.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.libffi.FFIType.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nsize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.libffi.FFIType.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static short nalignment(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFIType.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFIType.ALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFIType.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFIType.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nelements(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.libffi.FFIType.ELEMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static void nsize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.system.libffi.FFIType.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nalignment(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFIType.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFIType.ALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void ntype(long r7, short r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFIType.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFIType.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putShort(r1, r2, r3)
            return
    }

    public static void nelements(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.system.libffi.FFIType.ELEMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.libffi.FFIType r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.system.libffi.FFIType.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.system.libffi.FFIType.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.libffi.FFIType.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.libffi.FFIType.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.libffi.FFIType.SIZE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.libffi.FFIType.ALIGNMENT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.libffi.FFIType.TYPE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.libffi.FFIType.ELEMENTS = r0
            return
    }
}
