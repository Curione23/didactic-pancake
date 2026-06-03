package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Color.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Color.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Color.class */
public class FT_Color extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Color> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int BLUE = 0;
    public static final int GREEN = 0;
    public static final int RED = 0;
    public static final int ALPHA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Color$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Color$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Color$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Color, org.lwjgl.util.freetype.FT_Color.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Color ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Color.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Color.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Color getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Color r0 = org.lwjgl.util.freetype.FT_Color.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte blue() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FT_Color.nblue(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte green() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FT_Color.ngreen(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte red() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FT_Color.nred(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte alpha() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FT_Color.nalpha(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Color.Buffer blue(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Color.nblue(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Color.Buffer green(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Color.ngreen(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Color.Buffer red(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Color.nred(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Color.Buffer alpha(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Color.nalpha(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Color r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Color$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Color r0 = org.lwjgl.util.freetype.FT_Color.create(r0)
                org.lwjgl.util.freetype.FT_Color.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Color(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Color create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Color(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte blue() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nblue(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte green() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ngreen(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte red() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nred(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte alpha() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nalpha(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Color blue(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nblue(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Color green(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngreen(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Color red(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nred(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Color alpha(@org.lwjgl.system.NativeType("FT_Byte") byte r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nalpha(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Color set(byte r4, byte r5, byte r6, byte r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.util.freetype.FT_Color r0 = r0.blue(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.util.freetype.FT_Color r0 = r0.green(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.util.freetype.FT_Color r0 = r0.red(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.util.freetype.FT_Color r0 = r0.alpha(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.util.freetype.FT_Color set(org.lwjgl.util.freetype.FT_Color r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color malloc() {
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color calloc() {
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color create() {
            int r0 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color create(long r6) {
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Color createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
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

    public static org.lwjgl.util.freetype.FT_Color.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Color.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Color.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Color r0 = new org.lwjgl.util.freetype.FT_Color
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Color.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Color.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Color$Buffer r0 = new org.lwjgl.util.freetype.FT_Color$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Color.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Color.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static byte nblue(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.BLUE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ngreen(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.GREEN
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nred(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.RED
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nalpha(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.ALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static void nblue(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.BLUE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void ngreen(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.GREEN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nred(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.RED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    public static void nalpha(long r7, byte r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Color.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Color.ALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putByte(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Color r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Color.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Color.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Color.BLUE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Color.GREEN = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Color.RED = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Color.ALPHA = r0
            return
    }
}
