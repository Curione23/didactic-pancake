package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_GlyphSlot.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_GlyphSlot.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_GlyphSlot.class */
@org.lwjgl.system.NativeType("struct FT_GlyphSlotRec")
public class FT_GlyphSlot extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_GlyphSlot> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int LIBRARY = 0;
    public static final int FACE = 0;
    public static final int NEXT = 0;
    public static final int GLYPH_INDEX = 0;
    public static final int GENERIC = 0;
    public static final int METRICS = 0;
    public static final int LINEARHORIADVANCE = 0;
    public static final int LINEARVERTADVANCE = 0;
    public static final int ADVANCE = 0;
    public static final int FORMAT = 0;
    public static final int BITMAP = 0;
    public static final int BITMAP_LEFT = 0;
    public static final int BITMAP_TOP = 0;
    public static final int OUTLINE = 0;
    public static final int NUM_SUBGLYPHS = 0;
    public static final int SUBGLYPHS = 0;
    public static final int CONTROL_DATA = 0;
    public static final int CONTROL_LEN = 0;
    public static final int LSB_DELTA = 0;
    public static final int RSB_DELTA = 0;
    public static final int OTHER = 0;
    public static final int INTERNAL = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_GlyphSlot$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_GlyphSlot$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_GlyphSlot$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_GlyphSlot, org.lwjgl.util.freetype.FT_GlyphSlot.Buffer> {
        private static final org.lwjgl.util.freetype.FT_GlyphSlot ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_GlyphSlot.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_GlyphSlot getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_GlyphSlot r0 = org.lwjgl.util.freetype.FT_GlyphSlot.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Library")
        public long library() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nlibrary(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Face face() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nface(r0)
                return r0
        }

        @javax.annotation.Nullable
        public org.lwjgl.util.freetype.FT_GlyphSlot next() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_GlyphSlot r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nnext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int glyph_index() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nglyph_index(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Generic generic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_GlyphSlot.ngeneric(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Glyph_Metrics metrics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Glyph_Metrics r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nmetrics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long linearHoriAdvance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nlinearHoriAdvance(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long linearVertAdvance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nlinearVertAdvance(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector advance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nadvance(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Glyph_Format")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nformat(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Bitmap bitmap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Bitmap r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nbitmap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int bitmap_left() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nbitmap_left(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int bitmap_top() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nbitmap_top(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Outline outline() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Outline r0 = org.lwjgl.util.freetype.FT_GlyphSlot.noutline(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long lsb_delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nlsb_delta(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long rsb_delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_GlyphSlot.nrsb_delta(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_GlyphSlot r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_GlyphSlot$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_GlyphSlot r0 = org.lwjgl.util.freetype.FT_GlyphSlot.create(r0)
                org.lwjgl.util.freetype.FT_GlyphSlot.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_GlyphSlot(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_GlyphSlot create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = new org.lwjgl.util.freetype.FT_GlyphSlot
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_GlyphSlot(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_GlyphSlot.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Library")
    public long library() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlibrary(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Face face() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Face r0 = nface(r0)
            return r0
    }

    @javax.annotation.Nullable
    public org.lwjgl.util.freetype.FT_GlyphSlot next() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = nnext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int glyph_index() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nglyph_index(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Generic generic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Generic r0 = ngeneric(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Glyph_Metrics metrics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Glyph_Metrics r0 = nmetrics(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long linearHoriAdvance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlinearHoriAdvance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long linearVertAdvance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlinearVertAdvance(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector advance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = nadvance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Glyph_Format")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Bitmap bitmap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Bitmap r0 = nbitmap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int bitmap_left() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbitmap_left(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int bitmap_top() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbitmap_top(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Outline outline() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Outline r0 = noutline(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long lsb_delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlsb_delta(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long rsb_delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrsb_delta(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_GlyphSlot create(long r6) {
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = new org.lwjgl.util.freetype.FT_GlyphSlot
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_GlyphSlot createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = new org.lwjgl.util.freetype.FT_GlyphSlot
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_GlyphSlot.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_GlyphSlot$Buffer r0 = new org.lwjgl.util.freetype.FT_GlyphSlot$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_GlyphSlot.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_GlyphSlot$Buffer r0 = new org.lwjgl.util.freetype.FT_GlyphSlot$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nlibrary(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.LIBRARY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Face nface(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.FACE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_Face r0 = org.lwjgl.util.freetype.FT_Face.create(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_GlyphSlot nnext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.NEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = createSafe(r0)
            return r0
    }

    public static int nglyph_index(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_GlyphSlot.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.GLYPH_INDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Generic ngeneric(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.GENERIC
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Generic r0 = org.lwjgl.util.freetype.FT_Generic.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Glyph_Metrics nmetrics(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.METRICS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Glyph_Metrics r0 = org.lwjgl.util.freetype.FT_Glyph_Metrics.create(r0)
            return r0
    }

    public static long nlinearHoriAdvance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.LINEARHORIADVANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nlinearVertAdvance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.LINEARVERTADVANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector nadvance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.ADVANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_GlyphSlot.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Bitmap nbitmap(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.BITMAP
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Bitmap r0 = org.lwjgl.util.freetype.FT_Bitmap.create(r0)
            return r0
    }

    public static int nbitmap_left(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_GlyphSlot.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.BITMAP_LEFT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbitmap_top(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_GlyphSlot.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.BITMAP_TOP
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline noutline(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.OUTLINE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Outline r0 = org.lwjgl.util.freetype.FT_Outline.create(r0)
            return r0
    }

    public static int nnum_subglyphs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_GlyphSlot.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.NUM_SUBGLYPHS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsubglyphs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.SUBGLYPHS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer ncontrol_data(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.CONTROL_DATA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = ncontrol_len(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static long ncontrol_len(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.CONTROL_LEN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nlsb_delta(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.LSB_DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nrsb_delta(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.RSB_DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nother(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.OTHER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ninternal(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_GlyphSlot.INTERNAL
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
            org.lwjgl.util.freetype.FT_GlyphSlot r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 22
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Generic.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Generic.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Glyph_Metrics.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Glyph_Metrics.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.freetype.FT_Vector.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Vector.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.util.freetype.FT_Bitmap.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Bitmap.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Outline.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.util.freetype.FT_GlyphSlot.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_GlyphSlot.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_GlyphSlot.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.LIBRARY = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.FACE = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.NEXT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.GLYPH_INDEX = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.GENERIC = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.METRICS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.LINEARHORIADVANCE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.LINEARVERTADVANCE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.ADVANCE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.FORMAT = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.BITMAP = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.BITMAP_LEFT = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.BITMAP_TOP = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.OUTLINE = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.NUM_SUBGLYPHS = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.SUBGLYPHS = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.CONTROL_DATA = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.CONTROL_LEN = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.LSB_DELTA = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.RSB_DELTA = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.OTHER = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_GlyphSlot.INTERNAL = r0
            return
    }
}
