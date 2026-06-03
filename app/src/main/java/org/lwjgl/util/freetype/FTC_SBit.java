package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_SBit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_SBit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_SBit.class */
@org.lwjgl.system.NativeType("struct FTC_SBitRec")
public class FTC_SBit extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FTC_SBit> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int LEFT = 0;
    public static final int TOP = 0;
    public static final int FORMAT = 0;
    public static final int MAX_GRAYS = 0;
    public static final int PITCH = 0;
    public static final int XADVANCE = 0;
    public static final int YADVANCE = 0;
    public static final int BUFFER = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_SBit$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_SBit$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FTC_SBit$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FTC_SBit, org.lwjgl.util.freetype.FTC_SBit.Buffer> {
        private static final org.lwjgl.util.freetype.FTC_SBit ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FTC_SBit.SIZEOF
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
        protected org.lwjgl.util.freetype.FTC_SBit.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FTC_SBit getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FTC_SBit r0 = org.lwjgl.util.freetype.FTC_SBit.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nwidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte left() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nleft(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte top() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.ntop(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nformat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte max_grays() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nmax_grays(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short pitch() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FTC_SBit.npitch(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte xadvance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nxadvance(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte yadvance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.FTC_SBit.nyadvance(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte *")
        public java.nio.ByteBuffer buffer(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FTC_SBit.nbuffer(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FTC_SBit r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FTC_SBit$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FTC_SBit r0 = org.lwjgl.util.freetype.FTC_SBit.create(r0)
                org.lwjgl.util.freetype.FTC_SBit.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FTC_SBit(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FTC_SBit create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FTC_SBit r0 = new org.lwjgl.util.freetype.FTC_SBit
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FTC_SBit(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FTC_SBit.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nwidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte left() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nleft(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte top() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = ntop(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nformat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte max_grays() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nmax_grays(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short pitch() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = npitch(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte xadvance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nxadvance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte yadvance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nyadvance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte *")
    public java.nio.ByteBuffer buffer(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = nbuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.FTC_SBit create(long r6) {
            org.lwjgl.util.freetype.FTC_SBit r0 = new org.lwjgl.util.freetype.FTC_SBit
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FTC_SBit createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FTC_SBit r0 = new org.lwjgl.util.freetype.FTC_SBit
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FTC_SBit.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FTC_SBit$Buffer r0 = new org.lwjgl.util.freetype.FTC_SBit$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FTC_SBit.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FTC_SBit$Buffer r0 = new org.lwjgl.util.freetype.FTC_SBit$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static byte nwidth(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nleft(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.LEFT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte ntop(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.TOP
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nmax_grays(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.MAX_GRAYS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static short npitch(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.PITCH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nxadvance(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.XADVANCE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nyadvance(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FTC_SBit.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FTC_SBit.YADVANCE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nbuffer(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FTC_SBit.BUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FTC_SBit r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
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
            r1 = r0
            r2 = 4
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.util.freetype.FTC_SBit.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FTC_SBit.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FTC_SBit.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.WIDTH = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.HEIGHT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.LEFT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.TOP = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.FORMAT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.MAX_GRAYS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.PITCH = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.XADVANCE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.YADVANCE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FTC_SBit.BUFFER = r0
            return
    }
}
