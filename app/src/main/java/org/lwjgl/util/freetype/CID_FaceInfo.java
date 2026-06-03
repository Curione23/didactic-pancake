package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceInfo.class */
@org.lwjgl.system.NativeType("struct CID_FaceInfoRec")
public class CID_FaceInfo extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.CID_FaceInfo> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CID_FONT_NAME = 0;
    public static final int CID_VERSION = 0;
    public static final int CID_FONT_TYPE = 0;
    public static final int REGISTRY = 0;
    public static final int ORDERING = 0;
    public static final int SUPPLEMENT = 0;
    public static final int FONT_INFO = 0;
    public static final int FONT_BBOX = 0;
    public static final int UID_BASE = 0;
    public static final int NUM_XUID = 0;
    public static final int XUID = 0;
    public static final int CIDMAP_OFFSET = 0;
    public static final int FD_BYTES = 0;
    public static final int GD_BYTES = 0;
    public static final int CID_COUNT = 0;
    public static final int NUM_DICTS = 0;
    public static final int FONT_DICTS = 0;
    public static final int DATA_OFFSET = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/CID_FaceInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.CID_FaceInfo, org.lwjgl.util.freetype.CID_FaceInfo.Buffer> {
        private static final org.lwjgl.util.freetype.CID_FaceInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.CID_FaceInfo.SIZEOF
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
        protected org.lwjgl.util.freetype.CID_FaceInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.CID_FaceInfo getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.CID_FaceInfo r0 = org.lwjgl.util.freetype.CID_FaceInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer cid_font_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.CID_FaceInfo.ncid_font_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String cid_font_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.CID_FaceInfo.ncid_font_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long cid_version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceInfo.ncid_version(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int cid_font_type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceInfo.ncid_font_type(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer registry() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.CID_FaceInfo.nregistry(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String registryString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.CID_FaceInfo.nregistryString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer ordering() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.CID_FaceInfo.nordering(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String orderingString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.CID_FaceInfo.norderingString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int supplement() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceInfo.nsupplement(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("PS_FontInfoRec")
        public org.lwjgl.util.freetype.PS_FontInfo font_info() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.PS_FontInfo r0 = org.lwjgl.util.freetype.CID_FaceInfo.nfont_info(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_BBox font_bbox() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_BBox r0 = org.lwjgl.util.freetype.CID_FaceInfo.nfont_bbox(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long uid_base() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceInfo.nuid_base(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int num_xuid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceInfo.nnum_xuid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong[16]")
        public org.lwjgl.CLongBuffer xuid() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.CLongBuffer r0 = org.lwjgl.util.freetype.CID_FaceInfo.nxuid(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long xuid(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                long r0 = org.lwjgl.util.freetype.CID_FaceInfo.nxuid(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long cidmap_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceInfo.ncidmap_offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int fd_bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceInfo.nfd_bytes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int gd_bytes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceInfo.ngd_bytes(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long cid_count() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceInfo.ncid_count(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int num_dicts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.CID_FaceInfo.nnum_dicts(r0)
                return r0
        }

        public org.lwjgl.util.freetype.CID_FaceDict font_dicts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.CID_FaceDict r0 = org.lwjgl.util.freetype.CID_FaceInfo.nfont_dicts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_ULong")
        public long data_offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.CID_FaceInfo.ndata_offset(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.CID_FaceInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.CID_FaceInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.CID_FaceInfo r0 = org.lwjgl.util.freetype.CID_FaceInfo.create(r0)
                org.lwjgl.util.freetype.CID_FaceInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected CID_FaceInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.CID_FaceInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.CID_FaceInfo r0 = new org.lwjgl.util.freetype.CID_FaceInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public CID_FaceInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.CID_FaceInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer cid_font_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ncid_font_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String cid_font_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = ncid_font_nameString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long cid_version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncid_version(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int cid_font_type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncid_font_type(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer registry() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nregistry(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String registryString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nregistryString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer ordering() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nordering(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String orderingString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = norderingString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int supplement() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupplement(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PS_FontInfoRec")
    public org.lwjgl.util.freetype.PS_FontInfo font_info() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.PS_FontInfo r0 = nfont_info(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox font_bbox() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_BBox r0 = nfont_bbox(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long uid_base() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuid_base(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int num_xuid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_xuid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong[16]")
    public org.lwjgl.CLongBuffer xuid() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.CLongBuffer r0 = nxuid(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long xuid(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            long r0 = nxuid(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long cidmap_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncidmap_offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int fd_bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfd_bytes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int gd_bytes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ngd_bytes(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long cid_count() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncid_count(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int num_dicts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnum_dicts(r0)
            return r0
    }

    public org.lwjgl.util.freetype.CID_FaceDict font_dicts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.CID_FaceDict r0 = nfont_dicts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_ULong")
    public long data_offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndata_offset(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.CID_FaceInfo create(long r6) {
            org.lwjgl.util.freetype.CID_FaceInfo r0 = new org.lwjgl.util.freetype.CID_FaceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.CID_FaceInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.CID_FaceInfo r0 = new org.lwjgl.util.freetype.CID_FaceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.CID_FaceInfo.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.CID_FaceInfo$Buffer r0 = new org.lwjgl.util.freetype.CID_FaceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.CID_FaceInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.CID_FaceInfo$Buffer r0 = new org.lwjgl.util.freetype.CID_FaceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static java.nio.ByteBuffer ncid_font_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.CID_FONT_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String ncid_font_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.CID_FONT_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long ncid_version(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.CID_VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int ncid_font_type(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CID_FONT_TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ByteBuffer nregistry(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.REGISTRY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nregistryString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.REGISTRY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer nordering(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.ORDERING
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String norderingString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.ORDERING
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static int nsupplement(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.SUPPLEMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.PS_FontInfo nfont_info(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.FONT_INFO
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.PS_FontInfo r0 = org.lwjgl.util.freetype.PS_FontInfo.create(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox nfont_bbox(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.FONT_BBOX
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.util.freetype.FT_BBox r0 = org.lwjgl.util.freetype.FT_BBox.create(r0)
            return r0
    }

    public static long nuid_base(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.UID_BASE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nnum_xuid(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.NUM_XUID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.CLongBuffer nxuid(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.XUID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            org.lwjgl.CLongBuffer r0 = org.lwjgl.system.MemoryUtil.memCLongBuffer(r0, r1)
            return r0
    }

    public static long nxuid(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.XUID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 16
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            int r2 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            long r2 = (long) r2
            long r1 = r1 * r2
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ncidmap_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.CIDMAP_OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nfd_bytes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.FD_BYTES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ngd_bytes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.GD_BYTES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ncid_count(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.CID_COUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nnum_dicts(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.CID_FaceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.NUM_DICTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.CID_FaceDict nfont_dicts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.FONT_DICTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.freetype.CID_FaceDict r0 = org.lwjgl.util.freetype.CID_FaceDict.create(r0)
            return r0
    }

    public static long ndata_offset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.CID_FaceInfo.DATA_OFFSET
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
            org.lwjgl.util.freetype.CID_FaceInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 18
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.SIZEOF
            int r4 = org.lwjgl.util.freetype.PS_FontInfo.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            int r4 = org.lwjgl.util.freetype.FT_BBox.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.util.freetype.CID_FaceInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.CID_FaceInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.CID_FaceInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.CID_FONT_NAME = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.CID_VERSION = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.CID_FONT_TYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.REGISTRY = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.ORDERING = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.SUPPLEMENT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.FONT_INFO = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.FONT_BBOX = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.UID_BASE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.NUM_XUID = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.XUID = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.CIDMAP_OFFSET = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.FD_BYTES = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.GD_BYTES = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.CID_COUNT = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.NUM_DICTS = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.FONT_DICTS = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.CID_FaceInfo.DATA_OFFSET = r0
            return
    }
}
