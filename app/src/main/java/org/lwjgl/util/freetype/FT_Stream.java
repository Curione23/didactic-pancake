package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Stream.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Stream.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Stream.class */
@org.lwjgl.system.NativeType("struct FT_StreamRec")
public class FT_Stream extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Stream> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BASE = 0;
    public static final int SIZE = 0;
    public static final int POS = 0;
    public static final int DESCRIPTOR = 0;
    public static final int PATHNAME = 0;
    public static final int READ = 0;
    public static final int CLOSE = 0;
    public static final int MEMORY = 0;
    public static final int CURSOR = 0;
    public static final int LIMIT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Stream$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Stream$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Stream$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Stream, org.lwjgl.util.freetype.FT_Stream.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Stream ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Stream.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Stream getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Stream r0 = org.lwjgl.util.freetype.FT_Stream.Buffer.ELEMENT_FACTORY
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("unsigned char *")
        public java.nio.ByteBuffer base() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Stream.nbase(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Stream.nsize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned long")
        public long pos() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Stream.npos(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_StreamDesc descriptor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_StreamDesc r0 = org.lwjgl.util.freetype.FT_Stream.ndescriptor(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_StreamDesc pathname() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_StreamDesc r0 = org.lwjgl.util.freetype.FT_Stream.npathname(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Stream_IoFunc read() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Stream_IoFunc r0 = org.lwjgl.util.freetype.FT_Stream.nread(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Stream_CloseFunc close$() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Stream_CloseFunc r0 = org.lwjgl.util.freetype.FT_Stream.nclose$(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer base(@javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Stream.nbase(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer size(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Stream.nsize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer pos(@org.lwjgl.system.NativeType("unsigned long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Stream.npos(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer descriptor(org.lwjgl.util.freetype.FT_StreamDesc r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Stream.ndescriptor(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer descriptor(java.util.function.Consumer<org.lwjgl.util.freetype.FT_StreamDesc> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.freetype.FT_StreamDesc r1 = r1.descriptor()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer pathname(org.lwjgl.util.freetype.FT_StreamDesc r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Stream.npathname(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer pathname(java.util.function.Consumer<org.lwjgl.util.freetype.FT_StreamDesc> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.util.freetype.FT_StreamDesc r1 = r1.pathname()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer read(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Stream_IoFunc") org.lwjgl.util.freetype.FT_Stream_IoFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Stream.nread(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Stream.Buffer close$(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Stream_CloseFunc") org.lwjgl.util.freetype.FT_Stream_CloseFuncI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Stream.nclose$(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Stream r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Stream$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Stream r0 = org.lwjgl.util.freetype.FT_Stream.create(r0)
                org.lwjgl.util.freetype.FT_Stream.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Stream(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Stream create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Stream(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public java.nio.ByteBuffer base() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nbase(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned long")
    public long pos() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npos(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_StreamDesc descriptor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_StreamDesc r0 = ndescriptor(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_StreamDesc pathname() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_StreamDesc r0 = npathname(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Stream_IoFunc read() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Stream_IoFunc r0 = nread(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Stream_CloseFunc close$() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Stream_CloseFunc r0 = nclose$(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream base(@javax.annotation.Nullable @org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbase(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream size(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream pos(@org.lwjgl.system.NativeType("unsigned long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npos(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream descriptor(org.lwjgl.util.freetype.FT_StreamDesc r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndescriptor(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream descriptor(java.util.function.Consumer<org.lwjgl.util.freetype.FT_StreamDesc> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.freetype.FT_StreamDesc r1 = r1.descriptor()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream pathname(org.lwjgl.util.freetype.FT_StreamDesc r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npathname(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream pathname(java.util.function.Consumer<org.lwjgl.util.freetype.FT_StreamDesc> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.util.freetype.FT_StreamDesc r1 = r1.pathname()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream read(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Stream_IoFunc") org.lwjgl.util.freetype.FT_Stream_IoFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nread(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream close$(@javax.annotation.Nullable @org.lwjgl.system.NativeType("FT_Stream_CloseFunc") org.lwjgl.util.freetype.FT_Stream_CloseFuncI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclose$(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream set(@javax.annotation.Nullable java.nio.ByteBuffer r5, long r6, long r8, org.lwjgl.util.freetype.FT_StreamDesc r10, org.lwjgl.util.freetype.FT_StreamDesc r11, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream_IoFuncI r12, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream_CloseFuncI r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_Stream r0 = r0.base(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.freetype.FT_Stream r0 = r0.size(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.freetype.FT_Stream r0 = r0.pos(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.freetype.FT_Stream r0 = r0.descriptor(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.freetype.FT_Stream r0 = r0.pathname(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.util.freetype.FT_Stream r0 = r0.read(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.util.freetype.FT_Stream r0 = r0.close$(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Stream set(org.lwjgl.util.freetype.FT_Stream r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream malloc() {
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream calloc() {
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream create() {
            int r0 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream create(long r6) {
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Stream createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
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

    public static org.lwjgl.util.freetype.FT_Stream.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Stream.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Stream.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Stream r0 = new org.lwjgl.util.freetype.FT_Stream
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Stream.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Stream.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Stream.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Stream$Buffer r0 = new org.lwjgl.util.freetype.FT_Stream$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Stream.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Stream.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nbase(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.BASE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nsize(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long nsize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long npos(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.POS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_StreamDesc ndescriptor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.DESCRIPTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_StreamDesc r0 = org.lwjgl.util.freetype.FT_StreamDesc.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_StreamDesc npathname(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.PATHNAME
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_StreamDesc r0 = org.lwjgl.util.freetype.FT_StreamDesc.create(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Stream_IoFunc nread(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.READ
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Stream_IoFunc r0 = org.lwjgl.util.freetype.FT_Stream_IoFunc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Stream_CloseFunc nclose$(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.CLOSE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Stream_CloseFunc r0 = org.lwjgl.util.freetype.FT_Stream_CloseFunc.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Memory nmemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.MEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Memory r0 = org.lwjgl.util.freetype.FT_Memory.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer ncursor(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.CURSOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nlimit$(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.LIMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static void nbase(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.BASE
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
            nsize(r0, r1)
            return
    }

    public static void nsize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void npos(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.POS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void ndescriptor(long r7, org.lwjgl.util.freetype.FT_StreamDesc r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.freetype.FT_Stream.DESCRIPTOR
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.freetype.FT_StreamDesc.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npathname(long r7, org.lwjgl.util.freetype.FT_StreamDesc r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.util.freetype.FT_Stream.PATHNAME
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.util.freetype.FT_StreamDesc.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nread(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream_IoFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.READ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nclose$(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Stream_CloseFuncI r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.CLOSE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmemory(long r5, @javax.annotation.Nullable org.lwjgl.util.freetype.FT_Memory r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.MEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncursor(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.CURSOR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlimit$(long r5, @javax.annotation.Nullable java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Stream.LIMIT
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
            org.lwjgl.util.freetype.FT_Stream r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Stream.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Stream.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Stream.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_StreamDesc.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_StreamDesc.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_StreamDesc.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_StreamDesc.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Stream.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.FT_Stream.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_Stream.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.freetype.FT_Stream.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.util.freetype.FT_Stream.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Stream.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Stream.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.BASE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.SIZE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.POS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.DESCRIPTOR = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.PATHNAME = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.READ = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.CLOSE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.MEMORY = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.CURSOR = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Stream.LIMIT = r0
            return
    }
}
