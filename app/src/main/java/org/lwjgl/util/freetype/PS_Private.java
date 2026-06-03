package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_Private.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_Private.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_Private.class */
@org.lwjgl.system.NativeType("struct PS_PrivateRec")
public class PS_Private extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.PS_Private> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int UNIQUE_ID = 0;
    public static final int LENIV = 0;
    public static final int NUM_BLUE_VALUES = 0;
    public static final int NUM_OTHER_BLUES = 0;
    public static final int NUM_FAMILY_BLUES = 0;
    public static final int NUM_FAMILY_OTHER_BLUES = 0;
    public static final int BLUE_VALUES = 0;
    public static final int OTHER_BLUES = 0;
    public static final int FAMILY_BLUES = 0;
    public static final int FAMILY_OTHER_BLUES = 0;
    public static final int BLUE_SCALE = 0;
    public static final int BLUE_SHIFT = 0;
    public static final int BLUE_FUZZ = 0;
    public static final int STANDARD_WIDTH = 0;
    public static final int STANDARD_HEIGHT = 0;
    public static final int NUM_SNAP_WIDTHS = 0;
    public static final int NUM_SNAP_HEIGHTS = 0;
    public static final int FORCE_BOLD = 0;
    public static final int ROUND_STEM_UP = 0;
    public static final int SNAP_WIDTHS = 0;
    public static final int SNAP_HEIGHTS = 0;
    public static final int EXPANSION_FACTOR = 0;
    public static final int LANGUAGE_GROUP = 0;
    public static final int PASSWORD = 0;
    public static final int MIN_FEATURE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_Private$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_Private$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/PS_Private$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.PS_Private, org.lwjgl.util.freetype.PS_Private.Buffer> {
        private static final org.lwjgl.util.freetype.PS_Private ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.PS_Private.SIZEOF
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
        protected org.lwjgl.util.freetype.PS_Private.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.PS_Private getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.PS_Private r0 = org.lwjgl.util.freetype.PS_Private.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int unique_id() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.PS_Private.nunique_id(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int lenIV() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.PS_Private.nlenIV(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte num_blue_values() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.PS_Private.nnum_blue_values(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte num_other_blues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.PS_Private.nnum_other_blues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte num_family_blues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.PS_Private.nnum_family_blues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte num_family_other_blues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.PS_Private.nnum_family_other_blues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[14]")
        public java.nio.ShortBuffer blue_values() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nblue_values(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short blue_values(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nblue_values(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[10]")
        public java.nio.ShortBuffer other_blues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nother_blues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short other_blues(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nother_blues(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[14]")
        public java.nio.ShortBuffer family_blues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nfamily_blues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short family_blues(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nfamily_blues(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[10]")
        public java.nio.ShortBuffer family_other_blues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nfamily_other_blues(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short family_other_blues(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nfamily_other_blues(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long blue_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.PS_Private.nblue_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int blue_shift() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.PS_Private.nblue_shift(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Int")
        public int blue_fuzz() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.PS_Private.nblue_fuzz(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort[1]")
        public java.nio.ShortBuffer standard_width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nstandard_width(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short standard_width(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nstandard_width(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort[1]")
        public java.nio.ShortBuffer standard_height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nstandard_height(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short standard_height(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nstandard_height(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte num_snap_widths() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.PS_Private.nnum_snap_widths(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Byte")
        public byte num_snap_heights() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.util.freetype.PS_Private.nnum_snap_heights(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Bool")
        public boolean force_bold() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.freetype.PS_Private.nforce_bold(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Bool")
        public boolean round_stem_up() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                boolean r0 = org.lwjgl.util.freetype.PS_Private.nround_stem_up(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[13]")
        public java.nio.ShortBuffer snap_widths() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nsnap_widths(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short snap_widths(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nsnap_widths(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[13]")
        public java.nio.ShortBuffer snap_heights() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nsnap_heights(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short snap_heights(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nsnap_heights(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long expansion_factor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.PS_Private.nexpansion_factor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long language_group() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.PS_Private.nlanguage_group(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long password() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.PS_Private.npassword(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[2]")
        public java.nio.ShortBuffer min_feature() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.PS_Private.nmin_feature(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short min_feature(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.PS_Private.nmin_feature(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.PS_Private r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.PS_Private$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.PS_Private r0 = org.lwjgl.util.freetype.PS_Private.create(r0)
                org.lwjgl.util.freetype.PS_Private.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected PS_Private(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.PS_Private create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.PS_Private r0 = new org.lwjgl.util.freetype.PS_Private
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public PS_Private(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.PS_Private.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int unique_id() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nunique_id(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int lenIV() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlenIV(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte num_blue_values() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_blue_values(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte num_other_blues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_other_blues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte num_family_blues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_family_blues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte num_family_other_blues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_family_other_blues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[14]")
    public java.nio.ShortBuffer blue_values() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nblue_values(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short blue_values(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nblue_values(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[10]")
    public java.nio.ShortBuffer other_blues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nother_blues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short other_blues(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nother_blues(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[14]")
    public java.nio.ShortBuffer family_blues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nfamily_blues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short family_blues(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nfamily_blues(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[10]")
    public java.nio.ShortBuffer family_other_blues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nfamily_other_blues(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short family_other_blues(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nfamily_other_blues(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long blue_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nblue_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int blue_shift() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nblue_shift(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Int")
    public int blue_fuzz() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nblue_fuzz(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort[1]")
    public java.nio.ShortBuffer standard_width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nstandard_width(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short standard_width(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nstandard_width(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort[1]")
    public java.nio.ShortBuffer standard_height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nstandard_height(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short standard_height(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nstandard_height(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte num_snap_widths() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_snap_widths(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Byte")
    public byte num_snap_heights() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nnum_snap_heights(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public boolean force_bold() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nforce_bold(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Bool")
    public boolean round_stem_up() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            boolean r0 = nround_stem_up(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[13]")
    public java.nio.ShortBuffer snap_widths() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nsnap_widths(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short snap_widths(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nsnap_widths(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[13]")
    public java.nio.ShortBuffer snap_heights() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nsnap_heights(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short snap_heights(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nsnap_heights(r0, r1)
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

    @org.lwjgl.system.NativeType("FT_Long")
    public long language_group() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlanguage_group(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long password() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npassword(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[2]")
    public java.nio.ShortBuffer min_feature() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nmin_feature(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short min_feature(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nmin_feature(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.PS_Private create(long r6) {
            org.lwjgl.util.freetype.PS_Private r0 = new org.lwjgl.util.freetype.PS_Private
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.PS_Private createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.PS_Private r0 = new org.lwjgl.util.freetype.PS_Private
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.PS_Private.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.PS_Private$Buffer r0 = new org.lwjgl.util.freetype.PS_Private$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.PS_Private.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.PS_Private$Buffer r0 = new org.lwjgl.util.freetype.PS_Private$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static int nunique_id(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.UNIQUE_ID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlenIV(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.LENIV
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nnum_blue_values(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.NUM_BLUE_VALUES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_other_blues(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.NUM_OTHER_BLUES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_family_blues(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.NUM_FAMILY_BLUES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_family_other_blues(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.NUM_FAMILY_OTHER_BLUES
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nblue_values(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.BLUE_VALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 14
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nblue_values(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.BLUE_VALUES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 14
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nother_blues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.OTHER_BLUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nother_blues(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.OTHER_BLUES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 10
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nfamily_blues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.FAMILY_BLUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 14
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nfamily_blues(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.FAMILY_BLUES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 14
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nfamily_other_blues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.FAMILY_OTHER_BLUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 10
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nfamily_other_blues(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.FAMILY_OTHER_BLUES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 10
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long nblue_scale(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.BLUE_SCALE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nblue_shift(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.BLUE_SHIFT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nblue_fuzz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.BLUE_FUZZ
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nstandard_width(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.STANDARD_WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 1
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nstandard_width(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.STANDARD_WIDTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nstandard_height(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.STANDARD_HEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 1
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nstandard_height(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.STANDARD_HEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 1
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static byte nnum_snap_widths(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.NUM_SNAP_WIDTHS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static byte nnum_snap_heights(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.NUM_SNAP_HEIGHTS
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static boolean nforce_bold(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.FORCE_BOLD
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

    public static boolean nround_stem_up(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.PS_Private.ROUND_STEM_UP
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

    public static java.nio.ShortBuffer nsnap_widths(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.SNAP_WIDTHS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 13
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nsnap_widths(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.SNAP_WIDTHS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 13
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nsnap_heights(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.SNAP_HEIGHTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 13
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nsnap_heights(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.SNAP_HEIGHTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 13
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long nexpansion_factor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.EXPANSION_FACTOR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nlanguage_group(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.LANGUAGE_GROUP
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long npassword(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.PASSWORD
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static java.nio.ShortBuffer nmin_feature(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.PS_Private.MIN_FEATURE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 2
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nmin_feature(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.PS_Private.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.PS_Private.MIN_FEATURE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 2
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
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
            org.lwjgl.util.freetype.PS_Private r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 25
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
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
            r4 = 14
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 2
            r4 = 14
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 2
            r4 = 10
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.util.freetype.PS_Private.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
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
            r3 = 2
            r4 = 1
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 2
            r4 = 1
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 1
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 2
            r4 = 13
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 2
            r4 = 13
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.util.freetype.PS_Private.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.util.freetype.PS_Private.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.util.freetype.PS_Private.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 2
            r4 = 2
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.PS_Private.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.PS_Private.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.UNIQUE_ID = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.LENIV = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.NUM_BLUE_VALUES = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.NUM_OTHER_BLUES = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.NUM_FAMILY_BLUES = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.NUM_FAMILY_OTHER_BLUES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.BLUE_VALUES = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.OTHER_BLUES = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.FAMILY_BLUES = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.FAMILY_OTHER_BLUES = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.BLUE_SCALE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.BLUE_SHIFT = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.BLUE_FUZZ = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.STANDARD_WIDTH = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.STANDARD_HEIGHT = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.NUM_SNAP_WIDTHS = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.NUM_SNAP_HEIGHTS = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.FORCE_BOLD = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.ROUND_STEM_UP = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.SNAP_WIDTHS = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.SNAP_HEIGHTS = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.EXPANSION_FACTOR = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.LANGUAGE_GROUP = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.PASSWORD = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.PS_Private.MIN_FEATURE = r0
            return
    }
}
