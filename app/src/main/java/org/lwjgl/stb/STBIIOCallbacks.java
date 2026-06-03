package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIIOCallbacks.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIIOCallbacks.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIIOCallbacks.class */
@org.lwjgl.system.NativeType("struct stbi_io_callbacks")
public class STBIIOCallbacks extends org.lwjgl.system.Struct<org.lwjgl.stb.STBIIOCallbacks> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int READ = 0;
    public static final int SKIP = 0;
    public static final int EOF = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIIOCallbacks$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIIOCallbacks$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBIIOCallbacks$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBIIOCallbacks, org.lwjgl.stb.STBIIOCallbacks.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBIIOCallbacks ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
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
        protected org.lwjgl.stb.STBIIOCallbacks.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBIIOCallbacks getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBIIOCallbacks r0 = org.lwjgl.stb.STBIIOCallbacks.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("int (*) (void *, char *, int)")
        public org.lwjgl.stb.STBIReadCallback read() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBIReadCallback r0 = org.lwjgl.stb.STBIIOCallbacks.nread(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void (*) (void *, int)")
        public org.lwjgl.stb.STBISkipCallback skip() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBISkipCallback r0 = org.lwjgl.stb.STBIIOCallbacks.nskip(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int (*) (void *)")
        public org.lwjgl.stb.STBIEOFCallback eof() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBIEOFCallback r0 = org.lwjgl.stb.STBIIOCallbacks.neof(r0)
                return r0
        }

        public org.lwjgl.stb.STBIIOCallbacks.Buffer read(@org.lwjgl.system.NativeType("int (*) (void *, char *, int)") org.lwjgl.stb.STBIReadCallbackI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIIOCallbacks.nread(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIIOCallbacks.Buffer skip(@org.lwjgl.system.NativeType("void (*) (void *, int)") org.lwjgl.stb.STBISkipCallbackI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIIOCallbacks.nskip(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.stb.STBIIOCallbacks.Buffer eof(@org.lwjgl.system.NativeType("int (*) (void *)") org.lwjgl.stb.STBIEOFCallbackI r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBIIOCallbacks.neof(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBIIOCallbacks r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBIIOCallbacks r0 = org.lwjgl.stb.STBIIOCallbacks.create(r0)
                org.lwjgl.stb.STBIIOCallbacks.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBIIOCallbacks(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBIIOCallbacks create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBIIOCallbacks(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("int (*) (void *, char *, int)")
    public org.lwjgl.stb.STBIReadCallback read() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBIReadCallback r0 = nread(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void (*) (void *, int)")
    public org.lwjgl.stb.STBISkipCallback skip() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBISkipCallback r0 = nskip(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int (*) (void *)")
    public org.lwjgl.stb.STBIEOFCallback eof() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBIEOFCallback r0 = neof(r0)
            return r0
    }

    public org.lwjgl.stb.STBIIOCallbacks read(@org.lwjgl.system.NativeType("int (*) (void *, char *, int)") org.lwjgl.stb.STBIReadCallbackI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nread(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIIOCallbacks skip(@org.lwjgl.system.NativeType("void (*) (void *, int)") org.lwjgl.stb.STBISkipCallbackI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nskip(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIIOCallbacks eof(@org.lwjgl.system.NativeType("int (*) (void *)") org.lwjgl.stb.STBIEOFCallbackI r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            neof(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.stb.STBIIOCallbacks set(org.lwjgl.stb.STBIReadCallbackI r4, org.lwjgl.stb.STBISkipCallbackI r5, org.lwjgl.stb.STBIEOFCallbackI r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBIIOCallbacks r0 = r0.read(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.stb.STBIIOCallbacks r0 = r0.skip(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.stb.STBIIOCallbacks r0 = r0.eof(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.stb.STBIIOCallbacks set(org.lwjgl.stb.STBIIOCallbacks r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks malloc() {
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            int r2 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks calloc() {
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks create() {
            int r0 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks create(long r6) {
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBIIOCallbacks createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks.Buffer malloc(int r6) {
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks.Buffer calloc(int r7) {
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
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

    public static org.lwjgl.stb.STBIIOCallbacks.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBIIOCallbacks.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBIIOCallbacks r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBIIOCallbacks r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBIIOCallbacks r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBIIOCallbacks r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBIIOCallbacks.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBIIOCallbacks.ALIGNOF
            int r4 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBIIOCallbacks r0 = new org.lwjgl.stb.STBIIOCallbacks
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBIIOCallbacks.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBIIOCallbacks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIIOCallbacks.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBIIOCallbacks$Buffer r0 = new org.lwjgl.stb.STBIIOCallbacks$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBIIOCallbacks.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBIIOCallbacks.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBIReadCallback nread(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.READ
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.stb.STBIReadCallback r0 = org.lwjgl.stb.STBIReadCallback.create(r0)
            return r0
    }

    public static org.lwjgl.stb.STBISkipCallback nskip(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.SKIP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.stb.STBISkipCallback r0 = org.lwjgl.stb.STBISkipCallback.create(r0)
            return r0
    }

    public static org.lwjgl.stb.STBIEOFCallback neof(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.EOF
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.stb.STBIEOFCallback r0 = org.lwjgl.stb.STBIEOFCallback.create(r0)
            return r0
    }

    public static void nread(long r5, org.lwjgl.stb.STBIReadCallbackI r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.READ
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nskip(long r5, org.lwjgl.stb.STBISkipCallbackI r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.SKIP
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void neof(long r5, org.lwjgl.stb.STBIEOFCallbackI r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.EOF
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.READ
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.SKIP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.stb.STBIIOCallbacks.EOF
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
            org.lwjgl.stb.STBIIOCallbacks r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.stb.STBIIOCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBIIOCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.stb.STBIIOCallbacks.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.stb.STBIIOCallbacks.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBIIOCallbacks.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIIOCallbacks.READ = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIIOCallbacks.SKIP = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBIIOCallbacks.EOF = r0
            return
    }
}
