package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Bitmap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Bitmap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Bitmap.class */
public class FT_Bitmap extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Bitmap> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ROWS = 0;
    public static final int WIDTH = 0;
    public static final int PITCH = 0;
    public static final int BUFFER = 0;
    public static final int NUM_GRAYS = 0;
    public static final int PIXEL_MODE = 0;
    public static final int PALETTE_MODE = 0;
    public static final int PALETTE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Bitmap$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Bitmap$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Bitmap$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Bitmap, org.lwjgl.util.freetype.FT_Bitmap.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Bitmap ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Bitmap.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Bitmap getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Bitmap r0 = org.lwjgl.util.freetype.FT_Bitmap.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int rows() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Bitmap.nrows(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned int")
        public int width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Bitmap.nwidth(r0)
                return r0
        }

        public int pitch() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Bitmap.npitch(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("unsigned char *")
        public java.nio.ByteBuffer buffer(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Bitmap.nbuffer(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned short")
        public short num_grays() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Bitmap.nnum_grays(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char")
        public byte pixel_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FT_Bitmap.npixel_mode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("unsigned char")
        public byte palette_mode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FT_Bitmap.npalette_mode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long palette() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Bitmap.npalette(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Bitmap r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Bitmap r0 = org.lwjgl.util.freetype.FT_Bitmap.create(r0)
                org.lwjgl.util.freetype.FT_Bitmap.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Bitmap(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Bitmap create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Bitmap(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int rows() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrows(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned int")
    public int width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nwidth(r0)
            return r0
    }

    public int pitch() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npitch(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("unsigned char *")
    public java.nio.ByteBuffer buffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = nbuffer(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned short")
    public short num_grays() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnum_grays(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char")
    public byte pixel_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npixel_mode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("unsigned char")
    public byte palette_mode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npalette_mode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long palette() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npalette(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap malloc() {
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap calloc() {
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap create() {
            int r0 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap create(long r6) {
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Bitmap createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
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

    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Bitmap r0 = new org.lwjgl.util.freetype.FT_Bitmap
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Bitmap$Buffer r0 = new org.lwjgl.util.freetype.FT_Bitmap$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nrows(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Bitmap.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.ROWS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Bitmap.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npitch(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Bitmap.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.PITCH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nbuffer(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Bitmap.BUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static short nnum_grays(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Bitmap.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.NUM_GRAYS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte npixel_mode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Bitmap.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.PIXEL_MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte npalette_mode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Bitmap.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.PALETTE_MODE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static long npalette(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Bitmap.PALETTE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Bitmap r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Bitmap.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Bitmap.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.ROWS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.WIDTH = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.PITCH = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.BUFFER = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.NUM_GRAYS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.PIXEL_MODE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.PALETTE_MODE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Bitmap.PALETTE = r0
            return
    }
}
