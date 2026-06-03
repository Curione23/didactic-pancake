package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_VertHeader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_VertHeader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_VertHeader.class */
public class TT_VertHeader extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.TT_VertHeader> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VERSION = 0;
    public static final int ASCENDER = 0;
    public static final int DESCENDER = 0;
    public static final int LINE_GAP = 0;
    public static final int ADVANCE_HEIGHT_MAX = 0;
    public static final int MIN_TOP_SIDE_BEARING = 0;
    public static final int MIN_BOTTOM_SIDE_BEARING = 0;
    public static final int YMAX_EXTENT = 0;
    public static final int CARET_SLOPE_RISE = 0;
    public static final int CARET_SLOPE_RUN = 0;
    public static final int CARET_OFFSET = 0;
    public static final int RESERVED = 0;
    public static final int METRIC_DATA_FORMAT = 0;
    public static final int NUMBER_OF_VMETRICS = 0;
    public static final int LONG_METRICS = 0;
    public static final int SHORT_METRICS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_VertHeader$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_VertHeader$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/TT_VertHeader$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.TT_VertHeader, org.lwjgl.util.freetype.TT_VertHeader.Buffer> {
        private static final org.lwjgl.util.freetype.TT_VertHeader ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.TT_VertHeader.SIZEOF
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
        protected org.lwjgl.util.freetype.TT_VertHeader.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.TT_VertHeader getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.TT_VertHeader r0 = org.lwjgl.util.freetype.TT_VertHeader.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long Version() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.TT_VertHeader.nVersion(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Ascender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nAscender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Descender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nDescender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Line_Gap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nLine_Gap(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short advance_Height_Max() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nadvance_Height_Max(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short min_Top_Side_Bearing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nmin_Top_Side_Bearing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short min_Bottom_Side_Bearing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nmin_Bottom_Side_Bearing(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short yMax_Extent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nyMax_Extent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short caret_Slope_Rise() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.ncaret_Slope_Rise(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short caret_Slope_Run() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.ncaret_Slope_Run(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short caret_Offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.ncaret_Offset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short[4]")
        public java.nio.ShortBuffer Reserved() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.TT_VertHeader.nReserved(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short Reserved(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nReserved(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Short")
        public short metric_Data_Format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nmetric_Data_Format(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short number_Of_VMetrics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.TT_VertHeader.nnumber_Of_VMetrics(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer long_metrics(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_VertHeader.nlong_metrics(r0, r1)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("void *")
        public java.nio.ByteBuffer short_metrics(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.TT_VertHeader.nshort_metrics(r0, r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_VertHeader r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.TT_VertHeader$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.TT_VertHeader r0 = org.lwjgl.util.freetype.TT_VertHeader.create(r0)
                org.lwjgl.util.freetype.TT_VertHeader.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected TT_VertHeader(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.TT_VertHeader create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.TT_VertHeader r0 = new org.lwjgl.util.freetype.TT_VertHeader
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public TT_VertHeader(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.TT_VertHeader.SIZEOF
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

    @org.lwjgl.system.NativeType("FT_Short")
    public short Ascender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nAscender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short Descender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nDescender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short Line_Gap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nLine_Gap(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short advance_Height_Max() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nadvance_Height_Max(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short min_Top_Side_Bearing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmin_Top_Side_Bearing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short min_Bottom_Side_Bearing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmin_Bottom_Side_Bearing(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short yMax_Extent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nyMax_Extent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short caret_Slope_Rise() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ncaret_Slope_Rise(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short caret_Slope_Run() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ncaret_Slope_Run(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short caret_Offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ncaret_Offset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short[4]")
    public java.nio.ShortBuffer Reserved() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = nReserved(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short Reserved(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            short r0 = nReserved(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Short")
    public short metric_Data_Format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nmetric_Data_Format(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short number_Of_VMetrics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nnumber_Of_VMetrics(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer long_metrics(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = nlong_metrics(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public java.nio.ByteBuffer short_metrics(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.ByteBuffer r0 = nshort_metrics(r0, r1)
            return r0
    }

    public static org.lwjgl.util.freetype.TT_VertHeader create(long r6) {
            org.lwjgl.util.freetype.TT_VertHeader r0 = new org.lwjgl.util.freetype.TT_VertHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_VertHeader createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_VertHeader r0 = new org.lwjgl.util.freetype.TT_VertHeader
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.TT_VertHeader.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.TT_VertHeader$Buffer r0 = new org.lwjgl.util.freetype.TT_VertHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.TT_VertHeader.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.TT_VertHeader$Buffer r0 = new org.lwjgl.util.freetype.TT_VertHeader$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static long nVersion(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_VertHeader.VERSION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static short nAscender(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.ASCENDER
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nDescender(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.DESCENDER
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nLine_Gap(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.LINE_GAP
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nadvance_Height_Max(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.ADVANCE_HEIGHT_MAX
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmin_Top_Side_Bearing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.MIN_TOP_SIDE_BEARING
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmin_Bottom_Side_Bearing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.MIN_BOTTOM_SIDE_BEARING
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nyMax_Extent(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.YMAX_EXTENT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ncaret_Slope_Rise(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.CARET_SLOPE_RISE
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ncaret_Slope_Run(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.CARET_SLOPE_RUN
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ncaret_Offset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.CARET_OFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static java.nio.ShortBuffer nReserved(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_VertHeader.RESERVED
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static short nReserved(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.RESERVED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 2
            long r3 = r3 * r4
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nmetric_Data_Format(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.METRIC_DATA_FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nnumber_Of_VMetrics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.TT_VertHeader.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.NUMBER_OF_VMETRICS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nlong_metrics(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_VertHeader.LONG_METRICS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.ByteBuffer nshort_metrics(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.TT_VertHeader.SHORT_METRICS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.TT_VertHeader r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 16
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
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
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
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
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.util.freetype.TT_VertHeader.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.TT_VertHeader.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.TT_VertHeader.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.VERSION = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.ASCENDER = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.DESCENDER = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.LINE_GAP = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.ADVANCE_HEIGHT_MAX = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.MIN_TOP_SIDE_BEARING = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.MIN_BOTTOM_SIDE_BEARING = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.YMAX_EXTENT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.CARET_SLOPE_RISE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.CARET_SLOPE_RUN = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.CARET_OFFSET = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.RESERVED = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.METRIC_DATA_FORMAT = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.NUMBER_OF_VMETRICS = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.LONG_METRICS = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.TT_VertHeader.SHORT_METRICS = r0
            return
    }
}
