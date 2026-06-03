package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Face.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Face.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Face.class */
@org.lwjgl.system.NativeType("struct FT_FaceRec")
public class FT_Face extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Face> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int NUM_FACES = 0;
    public static final int FACE_INDEX = 0;
    public static final int FACE_FLAGS = 0;
    public static final int STYLE_FLAGS = 0;
    public static final int NUM_GLYPHS = 0;
    public static final int FAMILY_NAME = 0;
    public static final int STYLE_NAME = 0;
    public static final int NUM_FIXED_SIZES = 0;
    public static final int AVAILABLE_SIZES = 0;
    public static final int NUM_CHARMAPS = 0;
    public static final int CHARMAPS = 0;
    public static final int GENERIC = 0;
    public static final int BBOX = 0;
    public static final int UNITS_PER_EM = 0;
    public static final int ASCENDER = 0;
    public static final int DESCENDER = 0;
    public static final int HEIGHT = 0;
    public static final int MAX_ADVANCE_WIDTH = 0;
    public static final int MAX_ADVANCE_HEIGHT = 0;
    public static final int UNDERLINE_POSITION = 0;
    public static final int UNDERLINE_THICKNESS = 0;
    public static final int GLYPH = 0;
    public static final int SIZE = 0;
    public static final int CHARMAP = 0;
    public static final int DRIVER = 0;
    public static final int MEMORY = 0;
    public static final int STREAM = 0;
    public static final int SIZES_LIST = 0;
    public static final int AUTOHINT = 0;
    public static final int EXTENSIONS = 0;
    public static final int INTERNAL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Face$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Face$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Face$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Face, org.lwjgl.util.freetype.FT_Face.Buffer> {
        private static final org.lwjgl.util.freetype.FT_Face ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Face.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Face.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Face getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Face.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long num_faces() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Face.nnum_faces(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long face_index() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Face.nface_index(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long face_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Face.nface_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long style_flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Face.nstyle_flags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long num_glyphs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Face.nnum_glyphs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer family_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Face.nfamily_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String family_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.FT_Face.nfamily_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer style_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Face.nstyle_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String style_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.FT_Face.nstyle_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int num_fixed_sizes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Face.nnum_fixed_sizes(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("FT_Bitmap_Size *")
        public org.lwjgl.util.freetype.FT_Bitmap_Size.Buffer available_sizes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Bitmap_Size$Buffer r0 = org.lwjgl.util.freetype.FT_Face.navailable_sizes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int num_charmaps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Face.nnum_charmaps(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_CharMap *")
        public org.lwjgl.PointerBuffer charmaps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.util.freetype.FT_Face.ncharmaps(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Generic generic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Face.ngeneric(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_BBox bbox() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_BBox r0 = org.lwjgl.util.freetype.FT_Face.nbbox(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short units_per_EM() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nunits_per_EM(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short ascender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nascender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short descender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.ndescender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short max_advance_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nmax_advance_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short max_advance_height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nmax_advance_height(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short underline_position() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nunderline_position(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short underline_thickness() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Face.nunderline_thickness(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_GlyphSlot glyph() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_GlyphSlot r0 = org.lwjgl.util.freetype.FT_Face.nglyph(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_Size size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Size r0 = org.lwjgl.util.freetype.FT_Face.nsize(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_CharMap charmap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_CharMap r0 = org.lwjgl.util.freetype.FT_Face.ncharmap(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Face r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Face$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Face.create(r0)
                org.lwjgl.util.freetype.FT_Face.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Face(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Face create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Face r0 = new org.lwjgl.util.freetype.FT_Face
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Face(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Face.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long num_faces() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nnum_faces(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long face_index() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nface_index(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long face_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nface_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long style_flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstyle_flags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long num_glyphs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nnum_glyphs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer family_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nfamily_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String family_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nfamily_nameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer style_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nstyle_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String style_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nstyle_nameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int num_fixed_sizes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_fixed_sizes(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("FT_Bitmap_Size *")
    public org.lwjgl.util.freetype.FT_Bitmap_Size.Buffer available_sizes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Bitmap_Size$Buffer r0 = navailable_sizes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int num_charmaps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_charmaps(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_CharMap *")
    public org.lwjgl.PointerBuffer charmaps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = ncharmaps(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic generic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Generic r0 = ngeneric(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox bbox() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_BBox r0 = nbbox(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short units_per_EM() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nunits_per_EM(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short ascender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nascender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short descender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ndescender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short max_advance_width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmax_advance_width(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short max_advance_height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmax_advance_height(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short underline_position() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nunderline_position(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short underline_thickness() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nunderline_thickness(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_GlyphSlot glyph() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = nglyph(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_Size size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Size r0 = nsize(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_CharMap charmap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_CharMap r0 = ncharmap(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Face create(long r6) {
            org.lwjgl.util.freetype.FT_Face r0 = new org.lwjgl.util.freetype.FT_Face
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Face createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Face r0 = new org.lwjgl.util.freetype.FT_Face
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Face.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Face$Buffer r0 = new org.lwjgl.util.freetype.FT_Face$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Face.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Face$Buffer r0 = new org.lwjgl.util.freetype.FT_Face$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nnum_faces(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.NUM_FACES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nface_index(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.FACE_INDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nface_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.FACE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nstyle_flags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.STYLE_FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nnum_glyphs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.NUM_GLYPHS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static java.nio.ByteBuffer nfamily_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.FAMILY_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nfamily_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.FAMILY_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer nstyle_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.STYLE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nstyle_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.STYLE_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static int nnum_fixed_sizes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.NUM_FIXED_SIZES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Bitmap_Size.Buffer navailable_sizes(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.AVAILABLE_SIZES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nnum_fixed_sizes(r1)
            org.lwjgl.util.freetype.FT_Bitmap_Size$Buffer r0 = org.lwjgl.util.freetype.FT_Bitmap_Size.createSafe(r0, r1)
            return r0
    }

    public static int nnum_charmaps(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.NUM_CHARMAPS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.PointerBuffer ncharmaps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.CHARMAPS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nnum_charmaps(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBuffer(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic ngeneric(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.GENERIC
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Generic.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox nbbox(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.BBOX
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_BBox r0 = org.lwjgl.util.freetype.FT_BBox.create(r0)
            return r0
    }

    public static short nunits_per_EM(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.UNITS_PER_EM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nascender(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.ASCENDER
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ndescender(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.DESCENDER
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nheight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmax_advance_width(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.MAX_ADVANCE_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmax_advance_height(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.MAX_ADVANCE_HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nunderline_position(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.UNDERLINE_POSITION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nunderline_thickness(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Face.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Face.UNDERLINE_THICKNESS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_GlyphSlot nglyph(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.GLYPH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = org.lwjgl.util.freetype.FT_GlyphSlot.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size nsize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Size r0 = org.lwjgl.util.freetype.FT_Size.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_CharMap ncharmap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.CHARMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_CharMap r0 = org.lwjgl.util.freetype.FT_CharMap.createSafe(r0)
            return r0
    }

    public static long ndriver(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.DRIVER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Memory nmemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.MEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Memory r0 = org.lwjgl.util.freetype.FT_Memory.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Stream nstream$(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.STREAM
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Stream r0 = org.lwjgl.util.freetype.FT_Stream.createSafe(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_List nsizes_list(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.SIZES_LIST
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_List r0 = org.lwjgl.util.freetype.FT_List.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic nautohint(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.AUTOHINT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Generic.create(r0)
            return r0
    }

    public static long nextensions(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.EXTENSIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ninternal(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Face.INTERNAL
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
            org.lwjgl.util.freetype.FT_Face r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 31
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Face.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Face.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Face.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Face.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Face.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_BBox.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r1 = r0
            r2 = 17
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            int r3 = org.lwjgl.util.freetype.FT_List.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_List.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            int r3 = org.lwjgl.util.freetype.FT_Face.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Face.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Face.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.NUM_FACES = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.FACE_INDEX = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.FACE_FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.STYLE_FLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.NUM_GLYPHS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.FAMILY_NAME = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.STYLE_NAME = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.NUM_FIXED_SIZES = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.AVAILABLE_SIZES = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.NUM_CHARMAPS = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.CHARMAPS = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.GENERIC = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.BBOX = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.UNITS_PER_EM = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.ASCENDER = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.DESCENDER = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.HEIGHT = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.MAX_ADVANCE_WIDTH = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.MAX_ADVANCE_HEIGHT = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.UNDERLINE_POSITION = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.UNDERLINE_THICKNESS = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.GLYPH = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.SIZE = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.CHARMAP = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.DRIVER = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.MEMORY = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.STREAM = r0
            r0 = r6
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.SIZES_LIST = r0
            r0 = r6
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.AUTOHINT = r0
            r0 = r6
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.EXTENSIONS = r0
            r0 = r6
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Face.INTERNAL = r0
            return
    }
}
