package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackContext.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackContext.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackContext.class */
@org.lwjgl.system.NativeType("struct stbtt_pack_context")
public class STBTTPackContext extends org.lwjgl.system.Struct<org.lwjgl.stb.STBTTPackContext> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int USER_ALLOCATOR_CONTEXT = 0;
    public static final int PACK_INFO = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int STRIDE_IN_BYTES = 0;
    public static final int PADDING = 0;
    public static final int SKIP_MISSING = 0;
    public static final int H_OVERSAMPLE = 0;
    public static final int V_OVERSAMPLE = 0;
    public static final int PIXELS = 0;
    public static final int NODES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackContext$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackContext$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBTTPackContext$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBTTPackContext, org.lwjgl.stb.STBTTPackContext.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBTTPackContext ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBTTPackContext.SIZEOF
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
        protected org.lwjgl.stb.STBTTPackContext.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBTTPackContext getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBTTPackContext r0 = org.lwjgl.stb.STBTTPackContext.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long user_allocator_context() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.stb.STBTTPackContext.nuser_allocator_context(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbrp_context *")
        public org.lwjgl.stb.STBRPContext pack_info() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBRPContext r0 = org.lwjgl.stb.STBTTPackContext.npack_info(r0)
                return r0
        }

        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.nwidth(r0)
                return r0
        }

        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.nheight(r0)
                return r0
        }

        public int stride_in_bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.nstride_in_bytes(r0)
                return r0
        }

        public int padding() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.npadding(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("int")
        public boolean skip_missing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.nskip_missing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int h_oversample() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.nh_oversample(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int v_oversample() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBTTPackContext.nv_oversample(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char *")
        public java.nio.ByteBuffer pixels(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.stb.STBTTPackContext.npixels(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("stbrp_node *")
        public org.lwjgl.stb.STBRPNode.Buffer nodes(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBRPNode$Buffer r0 = org.lwjgl.stb.STBTTPackContext.nnodes(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTPackContext r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBTTPackContext$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBTTPackContext r0 = org.lwjgl.stb.STBTTPackContext.create(r0)
                org.lwjgl.stb.STBTTPackContext.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBTTPackContext(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBTTPackContext create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBTTPackContext(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long user_allocator_context() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuser_allocator_context(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbrp_context *")
    public org.lwjgl.stb.STBRPContext pack_info() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBRPContext r0 = npack_info(r0)
            return r0
    }

    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    public int height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheight(r0)
            return r0
    }

    public int stride_in_bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstride_in_bytes(r0)
            return r0
    }

    public int padding() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npadding(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("int")
    public boolean skip_missing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nskip_missing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int h_oversample() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nh_oversample(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int v_oversample() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nv_oversample(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char *")
    public java.nio.ByteBuffer pixels(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = npixels(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("stbrp_node *")
    public org.lwjgl.stb.STBRPNode.Buffer nodes(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.stb.STBRPNode$Buffer r0 = nnodes(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext malloc() {
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            int r2 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext calloc() {
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext create() {
            int r0 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext create(long r6) {
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTPackContext createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext.Buffer malloc(int r6) {
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext.Buffer calloc(int r7) {
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
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

    public static org.lwjgl.stb.STBTTPackContext.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBTTPackContext.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackContext r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackContext r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBTTPackContext r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBTTPackContext r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBTTPackContext.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBTTPackContext.ALIGNOF
            int r4 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBTTPackContext r0 = new org.lwjgl.stb.STBTTPackContext
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTPackContext.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBTTPackContext.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBTTPackContext$Buffer r0 = new org.lwjgl.stb.STBTTPackContext$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBTTPackContext.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBTTPackContext.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nuser_allocator_context(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackContext.USER_ALLOCATOR_CONTEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext npack_info(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackContext.PACK_INFO
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.stb.STBRPContext r0 = org.lwjgl.stb.STBRPContext.create(r0)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstride_in_bytes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.STRIDE_IN_BYTES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npadding(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.PADDING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nskip_missing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.SKIP_MISSING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nh_oversample(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.H_OVERSAMPLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nv_oversample(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBTTPackContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBTTPackContext.V_OVERSAMPLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npixels(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackContext.PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBRPNode.Buffer nnodes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBTTPackContext.NODES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.stb.STBRPNode$Buffer r0 = org.lwjgl.stb.STBRPNode.create(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.stb.STBTTPackContext r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.stb.STBTTPackContext.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBTTPackContext.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.stb.STBTTPackContext.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.stb.STBTTPackContext.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.stb.STBTTPackContext.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBTTPackContext.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.USER_ALLOCATOR_CONTEXT = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.PACK_INFO = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.WIDTH = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.HEIGHT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.STRIDE_IN_BYTES = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.PADDING = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.SKIP_MISSING = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.H_OVERSAMPLE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.V_OVERSAMPLE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.PIXELS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBTTPackContext.NODES = r0
            return
    }
}
