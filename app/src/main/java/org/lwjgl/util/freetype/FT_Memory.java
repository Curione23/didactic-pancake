package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Memory.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Memory.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Memory.class */
@org.lwjgl.system.NativeType("struct FT_MemoryRec_")
public class FT_Memory extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Memory> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int USER = 0;
    public static final int ALLOC = 0;
    public static final int FREE = 0;
    public static final int REALLOC = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Memory$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Memory$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Memory$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Memory, org.lwjgl.util.freetype.FT_Memory.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Memory ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Memory.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Memory getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Memory r0 = org.lwjgl.util.freetype.FT_Memory.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long user() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Memory.nuser(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Alloc_Func alloc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Alloc_Func r0 = org.lwjgl.util.freetype.FT_Memory.nalloc(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Free_Func free$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Free_Func r0 = org.lwjgl.util.freetype.FT_Memory.nfree$(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Realloc_Func realloc() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Realloc_Func r0 = org.lwjgl.util.freetype.FT_Memory.nrealloc(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Memory.Buffer user(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Memory.nuser(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Memory.Buffer alloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Alloc_Func") org.lwjgl.util.freetype.FT_Alloc_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Memory.nalloc(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Memory.Buffer free$(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Free_Func") org.lwjgl.util.freetype.FT_Free_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Memory.nfree$(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Memory.Buffer realloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Realloc_Func") org.lwjgl.util.freetype.FT_Realloc_FuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Memory.nrealloc(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Memory r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Memory$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Memory r0 = org.lwjgl.util.freetype.FT_Memory.create(r0)
                org.lwjgl.util.freetype.FT_Memory.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Memory(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Memory create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Memory(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long user() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Alloc_Func alloc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Alloc_Func r0 = nalloc(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Free_Func free$() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Free_Func r0 = nfree$(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Realloc_Func realloc() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Realloc_Func r0 = nrealloc(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Memory user(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nuser(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Memory alloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Alloc_Func") org.lwjgl.util.freetype.FT_Alloc_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nalloc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Memory free$(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Free_Func") org.lwjgl.util.freetype.FT_Free_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfree$(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Memory realloc(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Realloc_Func") org.lwjgl.util.freetype.FT_Realloc_FuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrealloc(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Memory set(long r5, org.lwjgl.util.freetype.FT_Alloc_FuncI r7, org.lwjgl.util.freetype.FT_Free_FuncI r8, org.lwjgl.util.freetype.FT_Realloc_FuncI r9) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_Memory r0 = r0.user(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.freetype.FT_Memory r0 = r0.alloc(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.freetype.FT_Memory r0 = r0.free$(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.freetype.FT_Memory r0 = r0.realloc(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Memory set(org.lwjgl.util.freetype.FT_Memory r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory malloc() {
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory calloc() {
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory create() {
            int r0 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory create(long r6) {
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Memory createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
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

    public static org.lwjgl.util.freetype.FT_Memory.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Memory.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Memory.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Memory r0 = new org.lwjgl.util.freetype.FT_Memory
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Memory.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Memory.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Memory.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Memory$Buffer r0 = new org.lwjgl.util.freetype.FT_Memory$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Memory.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Memory.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nuser(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.USER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Alloc_Func nalloc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Alloc_Func r0 = org.lwjgl.util.freetype.FT_Alloc_Func.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Free_Func nfree$(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.FREE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Free_Func r0 = org.lwjgl.util.freetype.FT_Free_Func.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Realloc_Func nrealloc(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.REALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Realloc_Func r0 = org.lwjgl.util.freetype.FT_Realloc_Func.createSafe(r0)
            return r0
    }

    public static void nuser(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.USER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nalloc(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Alloc_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.ALLOC
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nfree$(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Free_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.FREE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nrealloc(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Realloc_FuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Memory.REALLOC
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
            org.lwjgl.util.freetype.FT_Memory r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Memory.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Memory.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Memory.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Memory.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Memory.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Memory.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Memory.USER = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Memory.ALLOC = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Memory.FREE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Memory.REALLOC = r0
            return
    }
}
