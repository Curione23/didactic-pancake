package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRPContext.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRPContext.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRPContext.class */
@org.lwjgl.system.NativeType("struct stbrp_context")
public class STBRPContext extends org.lwjgl.system.Struct<org.lwjgl.stb.STBRPContext> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int ALIGN = 0;
    public static final int INIT_MODE = 0;
    public static final int HEURISTIC = 0;
    public static final int NUM_NODES = 0;
    public static final int ACTIVE_HEAD = 0;
    public static final int FREE_HEAD = 0;
    public static final int EXTRA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRPContext$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRPContext$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBRPContext$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.stb.STBRPContext, org.lwjgl.stb.STBRPContext.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.stb.STBRPContext ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.stb.STBRPContext.SIZEOF
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
        protected org.lwjgl.stb.STBRPContext.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.stb.STBRPContext getElementFactory() {
                r2 = this;
                org.lwjgl.stb.STBRPContext r0 = org.lwjgl.stb.STBRPContext.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBRPContext.nwidth(r0)
                return r0
        }

        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBRPContext.nheight(r0)
                return r0
        }

        public int align() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBRPContext.nalign(r0)
                return r0
        }

        public int init_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBRPContext.ninit_mode(r0)
                return r0
        }

        public int heuristic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBRPContext.nheuristic(r0)
                return r0
        }

        public int num_nodes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.stb.STBRPContext.nnum_nodes(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("stbrp_node *")
        public org.lwjgl.stb.STBRPNode active_head() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBRPNode r0 = org.lwjgl.stb.STBRPContext.nactive_head(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("stbrp_node *")
        public org.lwjgl.stb.STBRPNode free_head() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBRPNode r0 = org.lwjgl.stb.STBRPContext.nfree_head(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbrp_node[2]")
        public org.lwjgl.stb.STBRPNode.Buffer extra() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.stb.STBRPNode$Buffer r0 = org.lwjgl.stb.STBRPContext.nextra(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("stbrp_node")
        public org.lwjgl.stb.STBRPNode extra(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.stb.STBRPNode r0 = org.lwjgl.stb.STBRPContext.nextra(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBRPContext r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.stb.STBRPContext$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.stb.STBRPContext r0 = org.lwjgl.stb.STBRPContext.create(r0)
                org.lwjgl.stb.STBRPContext.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected STBRPContext(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.stb.STBRPContext create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public STBRPContext(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.stb.STBRPContext.SIZEOF
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

    public int align() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nalign(r0)
            return r0
    }

    public int init_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninit_mode(r0)
            return r0
    }

    public int heuristic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheuristic(r0)
            return r0
    }

    public int num_nodes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_nodes(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbrp_node *")
    public org.lwjgl.stb.STBRPNode active_head() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBRPNode r0 = nactive_head(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("stbrp_node *")
    public org.lwjgl.stb.STBRPNode free_head() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBRPNode r0 = nfree_head(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbrp_node[2]")
    public org.lwjgl.stb.STBRPNode.Buffer extra() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.stb.STBRPNode$Buffer r0 = nextra(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("stbrp_node")
    public org.lwjgl.stb.STBRPNode extra(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.stb.STBRPNode r0 = nextra(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext malloc() {
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            int r2 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext calloc() {
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext create() {
            int r0 = org.lwjgl.stb.STBRPContext.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext create(long r6) {
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBRPContext createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.stb.STBRPContext.Buffer malloc(int r6) {
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext.Buffer calloc(int r7) {
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.stb.STBRPContext.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
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

    public static org.lwjgl.stb.STBRPContext.Buffer create(long r6, int r8) {
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBRPContext.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBRPContext r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBRPContext r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBRPContext r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.stb.STBRPContext r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBRPContext$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.stb.STBRPContext$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBRPContext$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.stb.STBRPContext.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.stb.STBRPContext$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.stb.STBRPContext.ALIGNOF
            int r4 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.stb.STBRPContext r0 = new org.lwjgl.stb.STBRPContext
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBRPContext.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBRPContext.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.stb.STBRPContext.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.stb.STBRPContext$Buffer r0 = new org.lwjgl.stb.STBRPContext$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.stb.STBRPContext.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.stb.STBRPContext.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBRPContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBRPContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nalign(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBRPContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.ALIGN
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ninit_mode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBRPContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.INIT_MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheuristic(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBRPContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.HEURISTIC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nnum_nodes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.stb.STBRPContext.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.stb.STBRPContext.NUM_NODES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBRPNode nactive_head(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBRPContext.ACTIVE_HEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.stb.STBRPNode r0 = org.lwjgl.stb.STBRPNode.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.stb.STBRPNode nfree_head(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBRPContext.FREE_HEAD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.stb.STBRPNode r0 = org.lwjgl.stb.STBRPNode.createSafe(r0)
            return r0
    }

    public static org.lwjgl.stb.STBRPNode.Buffer nextra(long r5) {
            r0 = r5
            int r1 = org.lwjgl.stb.STBRPContext.EXTRA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            org.lwjgl.stb.STBRPNode$Buffer r0 = org.lwjgl.stb.STBRPNode.create(r0, r1)
            return r0
    }

    public static org.lwjgl.stb.STBRPNode nextra(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.stb.STBRPContext.EXTRA
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.stb.STBRPNode.SIZEOF
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            org.lwjgl.stb.STBRPNode r0 = org.lwjgl.stb.STBRPNode.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.stb.STBRPContext r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
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
            int r3 = org.lwjgl.stb.STBRPContext.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.stb.STBRPContext.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.stb.STBRPNode.SIZEOF
            int r4 = org.lwjgl.stb.STBRPNode.ALIGNOF
            r5 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4, r5)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r7 = r0
            r0 = r7
            int r0 = r0.getSize()
            org.lwjgl.stb.STBRPContext.SIZEOF = r0
            r0 = r7
            int r0 = r0.getAlignment()
            org.lwjgl.stb.STBRPContext.ALIGNOF = r0
            r0 = r7
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.WIDTH = r0
            r0 = r7
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.HEIGHT = r0
            r0 = r7
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.ALIGN = r0
            r0 = r7
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.INIT_MODE = r0
            r0 = r7
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.HEURISTIC = r0
            r0 = r7
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.NUM_NODES = r0
            r0 = r7
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.ACTIVE_HEAD = r0
            r0 = r7
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.FREE_HEAD = r0
            r0 = r7
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.stb.STBRPContext.EXTRA = r0
            return
    }
}
