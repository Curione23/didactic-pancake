package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Open_Args.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Open_Args.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Open_Args.class */
public class FT_Open_Args extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Open_Args> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int MEMORY_BASE = 0;
    public static final int MEMORY_SIZE = 0;
    public static final int PATHNAME = 0;
    public static final int STREAM = 0;
    public static final int DRIVER = 0;
    public static final int NUM_PARAMS = 0;
    public static final int PARAMS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Open_Args$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Open_Args$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Open_Args$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Open_Args, org.lwjgl.util.freetype.FT_Open_Args.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Open_Args ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Open_Args.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Open_Args getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Open_Args r0 = org.lwjgl.util.freetype.FT_Open_Args.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Open_Args.nflags(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("FT_Byte const *")
        public java.nio.ByteBuffer memory_base() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Open_Args.nmemory_base(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long memory_size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Open_Args.nmemory_size(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer pathname() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Open_Args.npathname(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String pathnameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.FT_Open_Args.npathnameString(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Stream stream$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Stream r0 = org.lwjgl.util.freetype.FT_Open_Args.nstream$(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Module")
        public long driver() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Open_Args.ndriver(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int num_params() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Open_Args.nnum_params(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("FT_Parameter *")
        public org.lwjgl.util.freetype.FT_Parameter.Buffer params() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Parameter$Buffer r0 = org.lwjgl.util.freetype.FT_Open_Args.nparams(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer flags(@org.lwjgl.system.NativeType("FT_UInt") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Open_Args.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer memory_base(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Byte const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Open_Args.nmemory_base(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer memory_size(@org.lwjgl.system.NativeType("FT_Long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Open_Args.nmemory_size(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer pathname(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_String *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Open_Args.npathname(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer stream$(@javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Open_Args.nstream$(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer driver(@org.lwjgl.system.NativeType("FT_Module") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Open_Args.ndriver(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer num_params(@org.lwjgl.system.NativeType("FT_Int") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Open_Args.nnum_params(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Open_Args.Buffer params(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Parameter *") org.lwjgl.util.freetype.FT_Parameter.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Open_Args.nparams(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Open_Args r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Open_Args r0 = org.lwjgl.util.freetype.FT_Open_Args.create(r0)
                org.lwjgl.util.freetype.FT_Open_Args.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Open_Args(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Open_Args create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Open_Args(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("FT_Byte const *")
    public java.nio.ByteBuffer memory_base() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nmemory_base(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long memory_size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmemory_size(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer pathname() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npathname(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String pathnameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = npathnameString(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Stream stream$() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Stream r0 = nstream$(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Module")
    public long driver() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndriver(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int num_params() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_params(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("FT_Parameter *")
    public org.lwjgl.util.freetype.FT_Parameter.Buffer params() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Parameter$Buffer r0 = nparams(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args flags(@org.lwjgl.system.NativeType("FT_UInt") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args memory_base(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Byte const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmemory_base(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args memory_size(@org.lwjgl.system.NativeType("FT_Long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmemory_size(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args pathname(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_String *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npathname(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args stream$(@javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstream$(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args driver(@org.lwjgl.system.NativeType("FT_Module") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndriver(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args num_params(@org.lwjgl.system.NativeType("FT_Int") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnum_params(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args params(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Parameter *") org.lwjgl.util.freetype.FT_Parameter.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nparams(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args set(int r5, @javax.annotation.Nullable java.nio.ByteBuffer r6, long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream r10, long r11, int r13, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Parameter.Buffer r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.flags(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.memory_base(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.memory_size(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.pathname(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.stream$(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.driver(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.num_params(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.params(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Open_Args set(org.lwjgl.util.freetype.FT_Open_Args r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args malloc() {
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args calloc() {
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args create() {
            int r0 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args create(long r6) {
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Open_Args createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
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

    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Open_Args r0 = new org.lwjgl.util.freetype.FT_Open_Args
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Open_Args.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Open_Args$Buffer r0 = new org.lwjgl.util.freetype.FT_Open_Args$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Open_Args.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Open_Args.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nmemory_base(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.MEMORY_BASE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nmemory_size(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nmemory_size(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.MEMORY_SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer npathname(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.PATHNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.lang.String npathnameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.PATHNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Stream nstream$(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.STREAM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Stream r0 = org.lwjgl.util.freetype.FT_Stream.createSafe(r0)
            return r0
    }

    public static long ndriver(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.DRIVER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nnum_params(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Open_Args.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.NUM_PARAMS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Parameter.Buffer nparams(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.PARAMS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nnum_params(r1)
            org.lwjgl.util.freetype.FT_Parameter$Buffer r0 = org.lwjgl.util.freetype.FT_Parameter.createSafe(r0, r1)
            return r0
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Open_Args.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nmemory_base(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.MEMORY_BASE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1b
        L16:
            r1 = r7
            int r1 = r1.remaining()
            long r1 = (long) r1
        L1b:
            nmemory_size(r0, r1)
            return
    }

    public static void nmemory_size(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.MEMORY_SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void npathname(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        La:
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.PATHNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nstream$(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.STREAM
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndriver(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.DRIVER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nnum_params(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Open_Args.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.NUM_PARAMS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nparams(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Parameter.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Open_Args.PARAMS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nnum_params(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Open_Args r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_Open_Args.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Open_Args.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Open_Args.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.FLAGS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.MEMORY_BASE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.MEMORY_SIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.PATHNAME = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.STREAM = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.DRIVER = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.NUM_PARAMS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Open_Args.PARAMS = r0
            return
    }
}
