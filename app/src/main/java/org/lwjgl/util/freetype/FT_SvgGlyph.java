package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SvgGlyph.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SvgGlyph.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SvgGlyph.class */
@org.lwjgl.system.NativeType("struct FT_SvgGlyphRec")
public class FT_SvgGlyph extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_SvgGlyph> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int ROOT = 0;
    public static final int SVG_DOCUMENT = 0;
    public static final int SVG_DOCUMENT_LENGTH = 0;
    public static final int GLYPH_INDEX = 0;
    public static final int METRICS = 0;
    public static final int UNITS_PER_EM = 0;
    public static final int START_GLYPH_ID = 0;
    public static final int END_GLYPH_ID = 0;
    public static final int TRANSFORM = 0;
    public static final int DELTA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SvgGlyph$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SvgGlyph$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_SvgGlyph$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_SvgGlyph, org.lwjgl.util.freetype.FT_SvgGlyph.Buffer> {
        private static final org.lwjgl.util.freetype.FT_SvgGlyph ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_SvgGlyph.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_SvgGlyph getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_SvgGlyph r0 = org.lwjgl.util.freetype.FT_SvgGlyph.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_GlyphRec")
        public org.lwjgl.util.freetype.FT_Glyph root() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Glyph r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nroot(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte *")
        public java.nio.ByteBuffer svg_document() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nsvg_document(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long svg_document_length() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nsvg_document_length(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int glyph_index() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nglyph_index(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Metrics metrics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Size_Metrics r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nmetrics(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short units_per_EM() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nunits_per_EM(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short start_glyph_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nstart_glyph_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short end_glyph_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_SvgGlyph.nend_glyph_id(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Matrix transform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Matrix r0 = org.lwjgl.util.freetype.FT_SvgGlyph.ntransform(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector delta() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_SvgGlyph.ndelta(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_SvgGlyph r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_SvgGlyph$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_SvgGlyph r0 = org.lwjgl.util.freetype.FT_SvgGlyph.create(r0)
                org.lwjgl.util.freetype.FT_SvgGlyph.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_SvgGlyph(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_SvgGlyph create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_SvgGlyph r0 = new org.lwjgl.util.freetype.FT_SvgGlyph
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_SvgGlyph(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_SvgGlyph.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_GlyphRec")
    public org.lwjgl.util.freetype.FT_Glyph root() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Glyph r0 = nroot(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte *")
    public java.nio.ByteBuffer svg_document() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nsvg_document(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long svg_document_length() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsvg_document_length(r0)
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

    public org.lwjgl.util.freetype.FT_Size_Metrics metrics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = nmetrics(r0)
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

    @org.lwjgl.system.NativeType("FT_UShort")
    public short start_glyph_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nstart_glyph_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short end_glyph_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nend_glyph_id(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Matrix transform() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Matrix r0 = ntransform(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector delta() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = ndelta(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SvgGlyph create(long r6) {
            org.lwjgl.util.freetype.FT_SvgGlyph r0 = new org.lwjgl.util.freetype.FT_SvgGlyph
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_SvgGlyph createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_SvgGlyph r0 = new org.lwjgl.util.freetype.FT_SvgGlyph
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_SvgGlyph.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_SvgGlyph$Buffer r0 = new org.lwjgl.util.freetype.FT_SvgGlyph$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_SvgGlyph.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_SvgGlyph$Buffer r0 = new org.lwjgl.util.freetype.FT_SvgGlyph$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Glyph nroot(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SvgGlyph.ROOT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Glyph r0 = org.lwjgl.util.freetype.FT_Glyph.create(r0)
            return r0
    }

    public static java.nio.ByteBuffer nsvg_document(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SvgGlyph.SVG_DOCUMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            long r1 = nsvg_document_length(r1)
            int r1 = (int) r1
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static long nsvg_document_length(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SvgGlyph.SVG_DOCUMENT_LENGTH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nglyph_index(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_SvgGlyph.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.GLYPH_INDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Metrics nmetrics(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SvgGlyph.METRICS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = org.lwjgl.util.freetype.FT_Size_Metrics.create(r0)
            return r0
    }

    public static short nunits_per_EM(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_SvgGlyph.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.UNITS_PER_EM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nstart_glyph_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_SvgGlyph.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.START_GLYPH_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nend_glyph_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_SvgGlyph.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.END_GLYPH_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Matrix ntransform(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SvgGlyph.TRANSFORM
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Matrix r0 = org.lwjgl.util.freetype.FT_Matrix.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector ndelta(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_SvgGlyph.DELTA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_SvgGlyph r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_Glyph.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Glyph.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_SvgGlyph.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Size_Metrics.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.util.freetype.FT_Matrix.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Matrix.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.util.freetype.FT_Vector.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Vector.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_SvgGlyph.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_SvgGlyph.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.ROOT = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.SVG_DOCUMENT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.SVG_DOCUMENT_LENGTH = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.GLYPH_INDEX = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.METRICS = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.UNITS_PER_EM = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.START_GLYPH_ID = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.END_GLYPH_ID = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.TRANSFORM = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_SvgGlyph.DELTA = r0
            return
    }
}
