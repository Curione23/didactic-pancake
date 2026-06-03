package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_FontInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_FontInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_FontInfo.class */
@org.lwjgl.system.NativeType("struct PS_FontInfoRec")
public class PS_FontInfo extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.PS_FontInfo> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VERSION = 0;
    public static final int NOTICE = 0;
    public static final int FULL_NAME = 0;
    public static final int FAMILY_NAME = 0;
    public static final int WEIGHT = 0;
    public static final int ITALIC_ANGLE = 0;
    public static final int IS_FIXED_PITCH = 0;
    public static final int UNDERLINE_POSITION = 0;
    public static final int UNDERLINE_THICKNESS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_FontInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_FontInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_FontInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.PS_FontInfo, org.lwjgl.util.freetype.PS_FontInfo.Buffer> {
        private static final org.lwjgl.util.freetype.PS_FontInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.PS_FontInfo.SIZEOF
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
        protected org.lwjgl.util.freetype.PS_FontInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.PS_FontInfo getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.PS_FontInfo r0 = org.lwjgl.util.freetype.PS_FontInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.PS_FontInfo.nversion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String versionString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.PS_FontInfo.nversionString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer notice() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.PS_FontInfo.nnotice(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String noticeString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.PS_FontInfo.nnoticeString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer full_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.PS_FontInfo.nfull_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String full_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.PS_FontInfo.nfull_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer family_name() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.PS_FontInfo.nfamily_name(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String family_nameString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.PS_FontInfo.nfamily_nameString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.nio.ByteBuffer weight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.PS_FontInfo.nweight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_String *")
        public java.lang.String weightString() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.lang.String r0 = org.lwjgl.util.freetype.PS_FontInfo.nweightString(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long italic_angle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.PS_FontInfo.nitalic_angle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Bool")
        public boolean is_fixed_pitch() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.freetype.PS_FontInfo.nis_fixed_pitch(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short underline_position() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.PS_FontInfo.nunderline_position(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short underline_thickness() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.PS_FontInfo.nunderline_thickness(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.PS_FontInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.PS_FontInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.PS_FontInfo r0 = org.lwjgl.util.freetype.PS_FontInfo.create(r0)
                org.lwjgl.util.freetype.PS_FontInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected PS_FontInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.PS_FontInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.PS_FontInfo r0 = new org.lwjgl.util.freetype.PS_FontInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public PS_FontInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.PS_FontInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer version() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nversion(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String versionString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nversionString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer notice() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nnotice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String noticeString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nnoticeString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.nio.ByteBuffer full_name() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nfull_name(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String full_nameString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nfull_nameString(r0)
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
    public java.nio.ByteBuffer weight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = nweight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_String *")
    public java.lang.String weightString() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.lang.String r0 = nweightString(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long italic_angle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nitalic_angle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public boolean is_fixed_pitch() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nis_fixed_pitch(r0)
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

    @org.lwjgl.system.NativeType("FT_UShort")
    public short underline_thickness() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nunderline_thickness(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.PS_FontInfo create(long r6) {
            org.lwjgl.util.freetype.PS_FontInfo r0 = new org.lwjgl.util.freetype.PS_FontInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.PS_FontInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.PS_FontInfo r0 = new org.lwjgl.util.freetype.PS_FontInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.PS_FontInfo.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.PS_FontInfo$Buffer r0 = new org.lwjgl.util.freetype.PS_FontInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.PS_FontInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.PS_FontInfo$Buffer r0 = new org.lwjgl.util.freetype.PS_FontInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static java.nio.ByteBuffer nversion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nversionString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer nnotice(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.NOTICE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nnoticeString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.NOTICE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer nfull_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.FULL_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nfull_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.FULL_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer nfamily_name(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.FAMILY_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nfamily_nameString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.FAMILY_NAME
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static java.nio.ByteBuffer nweight(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.WEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferNT1(r0)
            return r0
    }

    public static java.lang.String nweightString(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.WEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0)
            return r0
    }

    public static long nitalic_angle(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_FontInfo.ITALIC_ANGLE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static boolean nis_fixed_pitch(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_FontInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.IS_FIXED_PITCH
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    public static short nunderline_position(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_FontInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.UNDERLINE_POSITION
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nunderline_thickness(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_FontInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.UNDERLINE_THICKNESS
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
            org.lwjgl.util.freetype.PS_FontInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.PS_FontInfo.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.PS_FontInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.PS_FontInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.VERSION = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.NOTICE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.FULL_NAME = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.FAMILY_NAME = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.WEIGHT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.ITALIC_ANGLE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.IS_FIXED_PITCH = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.UNDERLINE_POSITION = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_FontInfo.UNDERLINE_THICKNESS = r0
            return
    }
}
