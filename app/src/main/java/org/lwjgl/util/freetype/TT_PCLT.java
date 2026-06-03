package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_PCLT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_PCLT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_PCLT.class */
public class TT_PCLT extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.TT_PCLT> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VERSION = 0;
    public static final int FONTNUMBER = 0;
    public static final int PITCH = 0;
    public static final int XHEIGHT = 0;
    public static final int STYLE = 0;
    public static final int TYPEFAMILY = 0;
    public static final int CAPHEIGHT = 0;
    public static final int SYMBOLSET = 0;
    public static final int TYPEFACE = 0;
    public static final int CHARACTERCOMPLEMENT = 0;
    public static final int FILENAME = 0;
    public static final int STROKEWEIGHT = 0;
    public static final int WIDTHTYPE = 0;
    public static final int SERIFSTYLE = 0;
    public static final int RESERVED = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_PCLT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_PCLT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_PCLT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.TT_PCLT, org.lwjgl.util.freetype.TT_PCLT.Buffer> {
        private static final org.lwjgl.util.freetype.TT_PCLT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.TT_PCLT.SIZEOF
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
        protected org.lwjgl.util.freetype.TT_PCLT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.TT_PCLT getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.TT_PCLT r0 = org.lwjgl.util.freetype.TT_PCLT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long Version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_PCLT.nVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long FontNumber() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_PCLT.nFontNumber(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short Pitch() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_PCLT.nPitch(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short xHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_PCLT.nxHeight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short Style() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_PCLT.nStyle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short TypeFamily() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_PCLT.nTypeFamily(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short CapHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_PCLT.nCapHeight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short SymbolSet() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_PCLT.nSymbolSet(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char[16]")
        public java.nio.ByteBuffer TypeFace() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_PCLT.nTypeFace(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte TypeFace(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nTypeFace(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char[8]")
        public java.nio.ByteBuffer CharacterComplement() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_PCLT.nCharacterComplement(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte CharacterComplement(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nCharacterComplement(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char[6]")
        public java.nio.ByteBuffer FileName() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_PCLT.nFileName(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte FileName(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nFileName(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte StrokeWeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nStrokeWeight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Char")
        public byte WidthType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nWidthType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte SerifStyle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nSerifStyle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte Reserved() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.TT_PCLT.nReserved(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_PCLT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_PCLT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.TT_PCLT r0 = org.lwjgl.util.freetype.TT_PCLT.create(r0)
                org.lwjgl.util.freetype.TT_PCLT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TT_PCLT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.TT_PCLT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.TT_PCLT r0 = new org.lwjgl.util.freetype.TT_PCLT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TT_PCLT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.TT_PCLT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long Version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nVersion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long FontNumber() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nFontNumber(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short Pitch() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nPitch(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short xHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nxHeight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short Style() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nStyle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short TypeFamily() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nTypeFamily(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short CapHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nCapHeight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short SymbolSet() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nSymbolSet(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char[16]")
    public java.nio.ByteBuffer TypeFace() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nTypeFace(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte TypeFace(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nTypeFace(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char[8]")
    public java.nio.ByteBuffer CharacterComplement() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nCharacterComplement(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte CharacterComplement(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nCharacterComplement(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char[6]")
    public java.nio.ByteBuffer FileName() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nFileName(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte FileName(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = nFileName(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte StrokeWeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nStrokeWeight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Char")
    public byte WidthType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nWidthType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte SerifStyle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nSerifStyle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte Reserved() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nReserved(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.TT_PCLT create(long r6) {
            org.lwjgl.util.freetype.TT_PCLT r0 = new org.lwjgl.util.freetype.TT_PCLT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_PCLT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_PCLT r0 = new org.lwjgl.util.freetype.TT_PCLT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.TT_PCLT.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.TT_PCLT$Buffer r0 = new org.lwjgl.util.freetype.TT_PCLT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_PCLT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_PCLT$Buffer r0 = new org.lwjgl.util.freetype.TT_PCLT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nVersion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_PCLT.VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nFontNumber(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_PCLT.FONTNUMBER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nPitch(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.PITCH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nxHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.XHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nStyle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.STYLE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nTypeFamily(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.TYPEFAMILY
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nCapHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.CAPHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nSymbolSet(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.SYMBOLSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nTypeFace(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_PCLT.TYPEFACE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nTypeFace(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.TT_PCLT.TYPEFACE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 16
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nCharacterComplement(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_PCLT.CHARACTERCOMPLEMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nCharacterComplement(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.TT_PCLT.CHARACTERCOMPLEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 8
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nFileName(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_PCLT.FILENAME
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 6
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte nFileName(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.TT_PCLT.FILENAME
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 6
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 1
            long r3 = r3 * r4
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nStrokeWeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.STROKEWEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nWidthType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.WIDTHTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nSerifStyle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.SERIFSTYLE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nReserved(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_PCLT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_PCLT.RESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.TT_PCLT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.TT_PCLT.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.TT_PCLT.CLONG_SIZE
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
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 1
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 1
            r4 = 8
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 1
            r4 = 6
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.TT_PCLT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.TT_PCLT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.VERSION = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.FONTNUMBER = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.PITCH = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.XHEIGHT = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.STYLE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.TYPEFAMILY = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.CAPHEIGHT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.SYMBOLSET = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.TYPEFACE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.CHARACTERCOMPLEMENT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.FILENAME = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.STROKEWEIGHT = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.WIDTHTYPE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.SERIFSTYLE = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_PCLT.RESERVED = r0
            return
    }
}
