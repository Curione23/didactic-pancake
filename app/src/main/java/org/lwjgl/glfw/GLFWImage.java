package org.lwjgl.glfw;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWImage.class */
@org.lwjgl.system.NativeType("struct GLFWimage")
public class GLFWImage extends org.lwjgl.system.Struct<org.lwjgl.glfw.GLFWImage> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int PIXELS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWImage$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWImage$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/glfw/GLFWImage$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.glfw.GLFWImage, org.lwjgl.glfw.GLFWImage.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.glfw.GLFWImage ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.glfw.GLFWImage.SIZEOF
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
        protected org.lwjgl.glfw.GLFWImage.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.glfw.GLFWImage getElementFactory() {
                r2 = this;
                org.lwjgl.glfw.GLFWImage r0 = org.lwjgl.glfw.GLFWImage.Buffer.ELEMENT_FACTORY
                return r0
        }

        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.glfw.GLFWImage.nwidth(r0)
                return r0
        }

        public int height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.glfw.GLFWImage.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char *")
        public java.nio.ByteBuffer pixels(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.glfw.GLFWImage.npixels(r0, r1)
                return r0
        }

        public org.lwjgl.glfw.GLFWImage.Buffer width(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWImage.nwidth(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWImage.Buffer height(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWImage.nheight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.glfw.GLFWImage.Buffer pixels(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.glfw.GLFWImage.npixels(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.glfw.GLFWImage r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.glfw.GLFWImage$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.glfw.GLFWImage r0 = org.lwjgl.glfw.GLFWImage.create(r0)
                org.lwjgl.glfw.GLFWImage.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected GLFWImage(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.glfw.GLFWImage create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public GLFWImage(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWImage.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.glfw.GLFWImage.SIZEOF
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

    @org.lwjgl.system.NativeType("unsigned char *")
    public java.nio.ByteBuffer pixels(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = npixels(r0, r1)
            return r0
    }

    public org.lwjgl.glfw.GLFWImage width(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nwidth(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWImage height(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWImage pixels(@org.lwjgl.system.NativeType("unsigned char *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npixels(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.glfw.GLFWImage set(int r4, int r5, java.nio.ByteBuffer r6) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.glfw.GLFWImage r0 = r0.width(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.glfw.GLFWImage r0 = r0.height(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.glfw.GLFWImage r0 = r0.pixels(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.glfw.GLFWImage set(org.lwjgl.glfw.GLFWImage r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.glfw.GLFWImage.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage malloc() {
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            int r2 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage calloc() {
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage create() {
            int r0 = org.lwjgl.glfw.GLFWImage.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage create(long r6) {
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWImage createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage.Buffer malloc(int r6) {
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage.Buffer calloc(int r7) {
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.glfw.GLFWImage.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
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

    public static org.lwjgl.glfw.GLFWImage.Buffer create(long r6, int r8) {
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.glfw.GLFWImage.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWImage r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWImage r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.glfw.GLFWImage r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.glfw.GLFWImage r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWImage$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.glfw.GLFWImage$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.glfw.GLFWImage$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.glfw.GLFWImage.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.glfw.GLFWImage$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.glfw.GLFWImage.ALIGNOF
            int r4 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.glfw.GLFWImage r0 = new org.lwjgl.glfw.GLFWImage
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWImage.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.glfw.GLFWImage.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.glfw.GLFWImage.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.glfw.GLFWImage.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.glfw.GLFWImage$Buffer r0 = new org.lwjgl.glfw.GLFWImage$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.glfw.GLFWImage.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.glfw.GLFWImage.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWImage.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWImage.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWImage.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWImage.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer npixels(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWImage.PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static void nwidth(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWImage.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWImage.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nheight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.glfw.GLFWImage.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.glfw.GLFWImage.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npixels(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWImage.PIXELS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.glfw.GLFWImage.PIXELS
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
            org.lwjgl.glfw.GLFWImage r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
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
            int r3 = org.lwjgl.glfw.GLFWImage.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.glfw.GLFWImage.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.glfw.GLFWImage.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWImage.WIDTH = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWImage.HEIGHT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.glfw.GLFWImage.PIXELS = r0
            return
    }
}
