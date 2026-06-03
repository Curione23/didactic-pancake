package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Header.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Header.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Header.class */
public class TT_Header extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.TT_Header> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TABLE_VERSION = 0;
    public static final int FONT_REVISION = 0;
    public static final int CHECKSUM_ADJUST = 0;
    public static final int MAGIC_NUMBER = 0;
    public static final int FLAGS = 0;
    public static final int UNITS_PER_EM = 0;
    public static final int CREATED = 0;
    public static final int MODIFIED = 0;
    public static final int XMIN = 0;
    public static final int YMIN = 0;
    public static final int XMAX = 0;
    public static final int YMAX = 0;
    public static final int MAC_STYLE = 0;
    public static final int LOWEST_REC_PPEM = 0;
    public static final int FONT_DIRECTION = 0;
    public static final int INDEX_TO_LOC_FORMAT = 0;
    public static final int GLYPH_DATA_FORMAT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Header$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Header$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_Header$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.TT_Header, org.lwjgl.util.freetype.TT_Header.Buffer> {
        private static final org.lwjgl.util.freetype.TT_Header ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.TT_Header.SIZEOF
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
        protected org.lwjgl.util.freetype.TT_Header.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.TT_Header getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.TT_Header r0 = org.lwjgl.util.freetype.TT_Header.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long Table_Version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Header.nTable_Version(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long Font_Revision() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Header.nFont_Revision(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long CheckSum_Adjust() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Header.nCheckSum_Adjust(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long Magic_Number() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_Header.nMagic_Number(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short Flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short Units_Per_EM() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nUnits_Per_EM(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong[2]")
        public org.lwjgl.CLongBuffer Created() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.CLongBuffer r0 = org.lwjgl.util.freetype.TT_Header.nCreated(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long Created(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                long r0 = org.lwjgl.util.freetype.TT_Header.nCreated(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong[2]")
        public org.lwjgl.CLongBuffer Modified() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.CLongBuffer r0 = org.lwjgl.util.freetype.TT_Header.nModified(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long Modified(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                long r0 = org.lwjgl.util.freetype.TT_Header.nModified(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short xMin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nxMin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short yMin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nyMin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short xMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nxMax(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short yMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nyMax(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short Mac_Style() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nMac_Style(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short Lowest_Rec_PPEM() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nLowest_Rec_PPEM(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Font_Direction() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nFont_Direction(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Index_To_Loc_Format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nIndex_To_Loc_Format(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Glyph_Data_Format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_Header.nGlyph_Data_Format(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_Header r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_Header$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.TT_Header r0 = org.lwjgl.util.freetype.TT_Header.create(r0)
                org.lwjgl.util.freetype.TT_Header.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TT_Header(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.TT_Header create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.TT_Header r0 = new org.lwjgl.util.freetype.TT_Header
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TT_Header(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.TT_Header.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long Table_Version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nTable_Version(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long Font_Revision() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nFont_Revision(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long CheckSum_Adjust() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nCheckSum_Adjust(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long Magic_Number() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nMagic_Number(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short Flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short Units_Per_EM() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nUnits_Per_EM(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong[2]")
    public org.lwjgl.CLongBuffer Created() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.CLongBuffer r0 = nCreated(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long Created(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = nCreated(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong[2]")
    public org.lwjgl.CLongBuffer Modified() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.CLongBuffer r0 = nModified(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long Modified(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = nModified(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short xMin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nxMin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short yMin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nyMin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short xMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nxMax(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short yMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nyMax(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short Mac_Style() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nMac_Style(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short Lowest_Rec_PPEM() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nLowest_Rec_PPEM(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short Font_Direction() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nFont_Direction(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short Index_To_Loc_Format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nIndex_To_Loc_Format(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short Glyph_Data_Format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nGlyph_Data_Format(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.TT_Header create(long r6) {
            org.lwjgl.util.freetype.TT_Header r0 = new org.lwjgl.util.freetype.TT_Header
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_Header createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_Header r0 = new org.lwjgl.util.freetype.TT_Header
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.TT_Header.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.TT_Header$Buffer r0 = new org.lwjgl.util.freetype.TT_Header$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_Header.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_Header$Buffer r0 = new org.lwjgl.util.freetype.TT_Header$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nTable_Version(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Header.TABLE_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nFont_Revision(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Header.FONT_REVISION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nCheckSum_Adjust(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Header.CHECKSUM_ADJUST
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nMagic_Number(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Header.MAGIC_NUMBER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nUnits_Per_EM(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.UNITS_PER_EM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.CLongBuffer nCreated(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Header.CREATED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            org.lwjgl.CLongBuffer r0 = org.lwjgl.system.MemoryUtil.memCLongBuffer(r0, r1)
            return r0
    }

    public static long nCreated(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.util.freetype.TT_Header.CREATED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static org.lwjgl.CLongBuffer nModified(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_Header.MODIFIED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            org.lwjgl.CLongBuffer r0 = org.lwjgl.system.MemoryUtil.memCLongBuffer(r0, r1)
            return r0
    }

    public static long nModified(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.util.freetype.TT_Header.MODIFIED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 2
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nxMin(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.XMIN
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nyMin(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.YMIN
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nxMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.XMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nyMax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.YMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nMac_Style(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.MAC_STYLE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nLowest_Rec_PPEM(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.LOWEST_REC_PPEM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nFont_Direction(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.FONT_DIRECTION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nIndex_To_Loc_Format(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.INDEX_TO_LOC_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nGlyph_Data_Format(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_Header.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_Header.GLYPH_DATA_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.TT_Header r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 17
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
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
            int r3 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.TT_Header.CLONG_SIZE
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.TT_Header.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.TT_Header.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.TABLE_VERSION = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.FONT_REVISION = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.CHECKSUM_ADJUST = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.MAGIC_NUMBER = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.FLAGS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.UNITS_PER_EM = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.CREATED = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.MODIFIED = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.XMIN = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.YMIN = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.XMAX = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.YMAX = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.MAC_STYLE = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.LOWEST_REC_PPEM = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.FONT_DIRECTION = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.INDEX_TO_LOC_FORMAT = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_Header.GLYPH_DATA_FORMAT = r0
            return
    }
}
