package org.lwjgl.system.libffi;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFICIF.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFICIF.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFICIF.class */
@org.lwjgl.system.NativeType("struct ffi_cif")
public class FFICIF extends org.lwjgl.system.Struct<org.lwjgl.system.libffi.FFICIF> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ABI = 0;
    public static final int NARGS = 0;
    public static final int ARG_TYPES = 0;
    public static final int RTYPE = 0;
    public static final int BYTES = 0;
    public static final int FLAGS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFICIF$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFICIF$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/libffi/FFICIF$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.libffi.FFICIF, org.lwjgl.system.libffi.FFICIF.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.libffi.FFICIF ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.libffi.FFICIF.SIZEOF
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
        protected org.lwjgl.system.libffi.FFICIF.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.libffi.FFICIF getElementFactory() {
                r2 = this;
                org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.libffi.FFICIF.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("ffi_abi")
        public int abi() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.libffi.FFICIF.nabi(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int nargs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.libffi.FFICIF.nnargs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("ffi_type **")
        public org.lwjgl.PointerBuffer arg_types(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.system.libffi.FFICIF.narg_types(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("ffi_type *")
        public org.lwjgl.system.libffi.FFIType rtype() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFICIF.nrtype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.libffi.FFICIF.nbytes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.system.libffi.FFICIF.nflags(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.libffi.FFICIF r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.libffi.FFICIF$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.libffi.FFICIF r0 = org.lwjgl.system.libffi.FFICIF.create(r0)
                org.lwjgl.system.libffi.FFICIF.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    private static native int offsets(long r0);

    protected FFICIF(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.libffi.FFICIF create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FFICIF(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("ffi_abi")
    public int abi() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nabi(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int nargs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnargs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("ffi_type **")
    public org.lwjgl.PointerBuffer arg_types(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = narg_types(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("ffi_type *")
    public org.lwjgl.system.libffi.FFIType rtype() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.system.libffi.FFIType r0 = nrtype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbytes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF malloc() {
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            int r2 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF calloc() {
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF create() {
            int r0 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF create(long r6) {
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.libffi.FFICIF createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF.Buffer malloc(int r6) {
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF.Buffer calloc(int r7) {
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
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

    public static org.lwjgl.system.libffi.FFICIF.Buffer create(long r6, int r8) {
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.libffi.FFICIF.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.libffi.FFICIF.ALIGNOF
            int r4 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.libffi.FFICIF r0 = new org.lwjgl.system.libffi.FFICIF
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFICIF.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.libffi.FFICIF.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.libffi.FFICIF.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.libffi.FFICIF$Buffer r0 = new org.lwjgl.system.libffi.FFICIF$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.libffi.FFICIF.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.libffi.FFICIF.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nabi(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFICIF.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFICIF.ABI
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnargs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFICIF.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFICIF.NARGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.PointerBuffer narg_types(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.system.libffi.FFICIF.ARG_TYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.system.libffi.FFIType nrtype(long r5) {
            r0 = r5
            int r1 = org.lwjgl.system.libffi.FFICIF.RTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.system.libffi.FFIType r0 = org.lwjgl.system.libffi.FFIType.create(r0)
            return r0
    }

    public static int nbytes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFICIF.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFICIF.BYTES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.libffi.FFICIF.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.libffi.FFICIF.FLAGS
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
            org.lwjgl.system.libffi.FFICIF r0 = r0.create(r1, r2)
            return r0
    }

    static {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r3 = r0
            r0 = 0
            r4 = r0
            r0 = r3
            r1 = 7
            java.nio.IntBuffer r0 = r0.mallocInt(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r5 = r0
            r0 = r5
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            int r0 = offsets(r0)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.SIZEOF = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.ABI = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 1
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.NARGS = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 2
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.ARG_TYPES = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 3
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.RTYPE = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 4
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.BYTES = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 5
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.FLAGS = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r5
            r1 = 6
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            org.lwjgl.system.libffi.FFICIF.ALIGNOF = r0     // Catch: java.lang.Throwable -> L6f java.lang.Throwable -> L74
            r0 = r3
            if (r0 == 0) goto L95
            r0 = r4
            if (r0 == 0) goto L68
            r0 = r3
            r0.close()     // Catch: java.lang.Throwable -> L5f
            goto L95
        L5f:
            r5 = move-exception
            r0 = r4
            r1 = r5
            r0.addSuppressed(r1)
            goto L95
        L68:
            r0 = r3
            r0.close()
            goto L95
        L6f:
            r5 = move-exception
            r0 = r5
            r4 = r0
            r0 = r5
            throw r0     // Catch: java.lang.Throwable -> L74
        L74:
            r6 = move-exception
            r0 = r3
            if (r0 == 0) goto L93
            r0 = r4
            if (r0 == 0) goto L8f
            r0 = r3
            r0.close()     // Catch: java.lang.Throwable -> L84
            goto L93
        L84:
            r7 = move-exception
            r0 = r4
            r1 = r7
            r0.addSuppressed(r1)
            goto L93
        L8f:
            r0 = r3
            r0.close()
        L93:
            r0 = r6
            throw r0
        L95:
            return
    }
}
