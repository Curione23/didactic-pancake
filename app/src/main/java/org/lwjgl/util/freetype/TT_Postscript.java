package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Postscript.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Postscript.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Postscript.class */
public class TT_Postscript extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.TT_Postscript> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FORMATTYPE = 0;
    public static final int ITALICANGLE = 0;
    public static final int UNDERLINEPOSITION = 0;
    public static final int UNDERLINETHICKNESS = 0;
    public static final int ISFIXEDPITCH = 0;
    public static final int MINMEMTYPE42 = 0;
    public static final int MAXMEMTYPE42 = 0;
    public static final int MINMEMTYPE1 = 0;
    public static final int MAXMEMTYPE1 = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Postscript$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Postscript$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Postscript$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.TT_Postscript, org.lwjgl.util.freetype.TT_Postscript.Buffer> {
        private static final org.lwjgl.util.freetype.TT_Postscript ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.TT_Postscript.SIZEOF
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
        protected org.lwjgl.util.freetype.TT_Postscript.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.TT_Postscript getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.TT_Postscript r0 = org.lwjgl.util.freetype.TT_Postscript.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long FormatType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nFormatType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long italicAngle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nitalicAngle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short underlinePosition() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Postscript.nunderlinePosition(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short underlineThickness() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Postscript.nunderlineThickness(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long isFixedPitch() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nisFixedPitch(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long minMemType42() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nminMemType42(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long maxMemType42() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nmaxMemType42(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long minMemType1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nminMemType1(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long maxMemType1() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Postscript.nmaxMemType1(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_Postscript r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_Postscript$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.TT_Postscript r0 = org.lwjgl.util.freetype.TT_Postscript.create(r0)
                org.lwjgl.util.freetype.TT_Postscript.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TT_Postscript(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.TT_Postscript create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.TT_Postscript r0 = new org.lwjgl.util.freetype.TT_Postscript
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TT_Postscript(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Postscript.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.TT_Postscript.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long FormatType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nFormatType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long italicAngle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nitalicAngle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short underlinePosition() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nunderlinePosition(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short underlineThickness() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nunderlineThickness(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long isFixedPitch() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nisFixedPitch(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long minMemType42() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminMemType42(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long maxMemType42() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxMemType42(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long minMemType1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminMemType1(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long maxMemType1() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxMemType1(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.TT_Postscript create(long r6) {
            org.lwjgl.util.freetype.TT_Postscript r0 = new org.lwjgl.util.freetype.TT_Postscript
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_Postscript createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_Postscript r0 = new org.lwjgl.util.freetype.TT_Postscript
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.TT_Postscript.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.TT_Postscript$Buffer r0 = new org.lwjgl.util.freetype.TT_Postscript$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_Postscript.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_Postscript$Buffer r0 = new org.lwjgl.util.freetype.TT_Postscript$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nFormatType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.FORMATTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nitalicAngle(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.ITALICANGLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nunderlinePosition(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Postscript.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Postscript.UNDERLINEPOSITION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nunderlineThickness(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Postscript.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Postscript.UNDERLINETHICKNESS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long nisFixedPitch(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.ISFIXEDPITCH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nminMemType42(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.MINMEMTYPE42
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmaxMemType42(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.MAXMEMTYPE42
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nminMemType1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.MINMEMTYPE1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmaxMemType1(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Postscript.MAXMEMTYPE1
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.TT_Postscript r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.freetype.TT_Postscript.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.TT_Postscript.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.TT_Postscript.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.FORMATTYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.ITALICANGLE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.UNDERLINEPOSITION = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.UNDERLINETHICKNESS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.ISFIXEDPITCH = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.MINMEMTYPE42 = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.MAXMEMTYPE42 = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.MINMEMTYPE1 = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Postscript.MAXMEMTYPE1 = r0
            return
    }
}
