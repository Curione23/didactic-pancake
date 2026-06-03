package org.lwjgl.nanovg;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/UIVec2.class */
@org.lwjgl.system.NativeType("struct UIvec2")
public class UIVec2 extends org.lwjgl.system.Struct<org.lwjgl.nanovg.UIVec2> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int V = 0;
    public static final int X = 0;
    public static final int Y = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/UIVec2$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.UIVec2, org.lwjgl.nanovg.UIVec2.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.nanovg.UIVec2 ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.UIVec2.SIZEOF
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
        protected org.lwjgl.nanovg.UIVec2.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.UIVec2 getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.UIVec2 r0 = org.lwjgl.nanovg.UIVec2.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("int[2]")
        public java.nio.IntBuffer v() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.nanovg.UIVec2.nv(r0)
                return r0
        }

        public int v(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                int r0 = org.lwjgl.nanovg.UIVec2.nv(r0, r1)
                return r0
        }

        public int x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.UIVec2.nx(r0)
                return r0
        }

        public int y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.UIVec2.ny(r0)
                return r0
        }

        public org.lwjgl.nanovg.UIVec2.Buffer v(@org.lwjgl.system.NativeType("int[2]") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.UIVec2.nv(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.UIVec2.Buffer v(int r6, int r7) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                r2 = r7
                org.lwjgl.nanovg.UIVec2.nv(r0, r1, r2)
                r0 = r5
                return r0
        }

        public org.lwjgl.nanovg.UIVec2.Buffer x(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.UIVec2.nx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.nanovg.UIVec2.Buffer y(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.nanovg.UIVec2.ny(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.UIVec2 r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.UIVec2$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.UIVec2 r0 = org.lwjgl.nanovg.UIVec2.create(r0)
                org.lwjgl.nanovg.UIVec2.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected UIVec2(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.UIVec2 create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public UIVec2(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.UIVec2.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.UIVec2.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("int[2]")
    public java.nio.IntBuffer v() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = nv(r0)
            return r0
    }

    public int v(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            int r0 = nv(r0, r1)
            return r0
    }

    public int x() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx(r0)
            return r0
    }

    public int y() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny(r0)
            return r0
    }

    public org.lwjgl.nanovg.UIVec2 v(@org.lwjgl.system.NativeType("int[2]") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nv(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.UIVec2 v(int r6, int r7) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            r2 = r7
            nv(r0, r1, r2)
            r0 = r5
            return r0
    }

    public org.lwjgl.nanovg.UIVec2 x(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.UIVec2 y(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ny(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.nanovg.UIVec2 set(org.lwjgl.nanovg.UIVec2 r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.nanovg.UIVec2.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2 malloc() {
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            int r2 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2 calloc() {
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2 create() {
            int r0 = org.lwjgl.nanovg.UIVec2.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2 create(long r6) {
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.UIVec2 createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2.Buffer malloc(int r6) {
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2.Buffer calloc(int r7) {
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.nanovg.UIVec2.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
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

    public static org.lwjgl.nanovg.UIVec2.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.UIVec2.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2 mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.UIVec2 r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2 callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.UIVec2 r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2 mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.UIVec2 r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2 callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.nanovg.UIVec2 r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.UIVec2$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.nanovg.UIVec2$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.UIVec2$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.nanovg.UIVec2.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.nanovg.UIVec2$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2 malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.nanovg.UIVec2.ALIGNOF
            int r4 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2 calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.nanovg.UIVec2 r0 = new org.lwjgl.nanovg.UIVec2
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.nanovg.UIVec2.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.UIVec2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.UIVec2.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.nanovg.UIVec2.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.nanovg.UIVec2$Buffer r0 = new org.lwjgl.nanovg.UIVec2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.nanovg.UIVec2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.nanovg.UIVec2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static java.nio.IntBuffer nv(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.UIVec2.V
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBuffer(r0, r1)
            return r0
    }

    public static int nv(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.UIVec2.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.UIVec2.V
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.UIVec2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.UIVec2.X
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.UIVec2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.UIVec2.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nv(long r7, java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 2
            org.lwjgl.system.Checks.checkGT(r0, r1)
        Lb:
            r0 = r9
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r7
            int r2 = org.lwjgl.nanovg.UIVec2.V
            long r2 = (long) r2
            long r1 = r1 + r2
            r2 = r9
            int r2 = r2.remaining()
            r3 = 4
            int r2 = r2 * r3
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nv(long r9, int r11, int r12) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.UIVec2.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.UIVec2.V
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            r3 = r12
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nx(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.UIVec2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.UIVec2.X
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ny(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.UIVec2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.UIVec2.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.UIVec2 r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 1
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member[] r3 = new org.lwjgl.system.Struct.Member[r3]
            r4 = r3
            r5 = 0
            r6 = 4
            r7 = 2
            org.lwjgl.system.Struct$Member r6 = __array(r6, r7)
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 2
            org.lwjgl.system.Struct$Member[] r6 = new org.lwjgl.system.Struct.Member[r6]
            r7 = r6
            r8 = 0
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            r7 = r6
            r8 = 1
            r9 = 4
            org.lwjgl.system.Struct$Member r9 = __member(r9)
            r7[r8] = r9
            org.lwjgl.system.Struct$Layout r6 = __struct(r6)
            r4[r5] = r6
            org.lwjgl.system.Struct$Layout r3 = __union(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r11 = r0
            r0 = r11
            int r0 = r0.getSize()
            org.lwjgl.nanovg.UIVec2.SIZEOF = r0
            r0 = r11
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.UIVec2.ALIGNOF = r0
            r0 = r11
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.UIVec2.V = r0
            r0 = r11
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.UIVec2.X = r0
            r0 = r11
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.UIVec2.Y = r0
            return
    }
}
