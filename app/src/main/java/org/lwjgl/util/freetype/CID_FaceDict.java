package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceDict.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceDict.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceDict.class */
@org.lwjgl.system.NativeType("struct CID_FaceDictRec")
public class CID_FaceDict extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.CID_FaceDict> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PRIVATE_DICT = 0;
    public static final int LEN_BUILDCHAR = 0;
    public static final int FORCEBOLD_THRESHOLD = 0;
    public static final int STROKE_WIDTH = 0;
    public static final int EXPANSION_FACTOR = 0;
    public static final int PAINT_TYPE = 0;
    public static final int FONT_TYPE = 0;
    public static final int FONT_MATRIX = 0;
    public static final int FONT_OFFSET = 0;
    public static final int NUM_SUBRS = 0;
    public static final int SUBRMAP_OFFSET = 0;
    public static final int SD_BYTES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceDict$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceDict$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceDict$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.CID_FaceDict, org.lwjgl.util.freetype.CID_FaceDict.Buffer> {
        private static final org.lwjgl.util.freetype.CID_FaceDict ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.CID_FaceDict.SIZEOF
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
        protected org.lwjgl.util.freetype.CID_FaceDict.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.CID_FaceDict getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.CID_FaceDict r0 = org.lwjgl.util.freetype.CID_FaceDict.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("PS_PrivateRec")
        public org.lwjgl.util.freetype.PS_Private private_dict() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.PS_Private r0 = org.lwjgl.util.freetype.CID_FaceDict.nprivate_dict(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int len_buildchar() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceDict.nlen_buildchar(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long forcebold_threshold() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceDict.nforcebold_threshold(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long stroke_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceDict.nstroke_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long expansion_factor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceDict.nexpansion_factor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte paint_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.CID_FaceDict.npaint_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte font_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.CID_FaceDict.nfont_type(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Matrix font_matrix() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Matrix r0 = org.lwjgl.util.freetype.CID_FaceDict.nfont_matrix(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Vector font_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.CID_FaceDict.nfont_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int num_subrs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceDict.nnum_subrs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long subrmap_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceDict.nsubrmap_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int sd_bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceDict.nsd_bytes(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.CID_FaceDict r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.CID_FaceDict$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.CID_FaceDict r0 = org.lwjgl.util.freetype.CID_FaceDict.create(r0)
                org.lwjgl.util.freetype.CID_FaceDict.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected CID_FaceDict(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.CID_FaceDict create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.CID_FaceDict r0 = new org.lwjgl.util.freetype.CID_FaceDict
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public CID_FaceDict(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.CID_FaceDict.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("PS_PrivateRec")
    public org.lwjgl.util.freetype.PS_Private private_dict() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.PS_Private r0 = nprivate_dict(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int len_buildchar() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlen_buildchar(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long forcebold_threshold() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nforcebold_threshold(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long stroke_width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstroke_width(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long expansion_factor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nexpansion_factor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte paint_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = npaint_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte font_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nfont_type(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Matrix font_matrix() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Matrix r0 = nfont_matrix(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Vector font_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector r0 = nfont_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int num_subrs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_subrs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long subrmap_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsubrmap_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int sd_bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsd_bytes(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.CID_FaceDict create(long r6) {
            org.lwjgl.util.freetype.CID_FaceDict r0 = new org.lwjgl.util.freetype.CID_FaceDict
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.CID_FaceDict createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.CID_FaceDict r0 = new org.lwjgl.util.freetype.CID_FaceDict
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.CID_FaceDict.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.CID_FaceDict$Buffer r0 = new org.lwjgl.util.freetype.CID_FaceDict$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.CID_FaceDict.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.CID_FaceDict$Buffer r0 = new org.lwjgl.util.freetype.CID_FaceDict$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.PS_Private nprivate_dict(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.PRIVATE_DICT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.PS_Private r0 = org.lwjgl.util.freetype.PS_Private.create(r0)
            return r0
    }

    public static int nlen_buildchar(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceDict.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.LEN_BUILDCHAR
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nforcebold_threshold(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.FORCEBOLD_THRESHOLD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nstroke_width(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.STROKE_WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nexpansion_factor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.EXPANSION_FACTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static byte npaint_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceDict.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.PAINT_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nfont_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceDict.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.FONT_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Matrix nfont_matrix(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.FONT_MATRIX
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Matrix r0 = org.lwjgl.util.freetype.FT_Matrix.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector nfont_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.FONT_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_Vector r0 = org.lwjgl.util.freetype.FT_Vector.create(r0)
            return r0
    }

    public static int nnum_subrs(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceDict.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.NUM_SUBRS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsubrmap_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceDict.SUBRMAP_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nsd_bytes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceDict.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.SD_BYTES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.CID_FaceDict r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.PS_Private.SIZEOF
            int r4 = org.lwjgl.util.freetype.PS_Private.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.CLONG_SIZE
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
            int r3 = org.lwjgl.util.freetype.FT_Matrix.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_Matrix.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.util.freetype.CID_FaceDict.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.CID_FaceDict.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.CID_FaceDict.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.PRIVATE_DICT = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.LEN_BUILDCHAR = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.FORCEBOLD_THRESHOLD = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.STROKE_WIDTH = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.EXPANSION_FACTOR = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.PAINT_TYPE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.FONT_TYPE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.FONT_MATRIX = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.FONT_OFFSET = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.NUM_SUBRS = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.SUBRMAP_OFFSET = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceDict.SD_BYTES = r0
            return
    }
}
