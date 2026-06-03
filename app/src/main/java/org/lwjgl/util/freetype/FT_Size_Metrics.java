package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Metrics.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Metrics.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Metrics.class */
public class FT_Size_Metrics extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Size_Metrics> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int X_PPEM = 0;
    public static final int Y_PPEM = 0;
    public static final int X_SCALE = 0;
    public static final int Y_SCALE = 0;
    public static final int ASCENDER = 0;
    public static final int DESCENDER = 0;
    public static final int HEIGHT = 0;
    public static final int MAX_ADVANCE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Metrics$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Metrics$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Metrics$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Size_Metrics, org.lwjgl.util.freetype.FT_Size_Metrics.Buffer> {
        private static final org.lwjgl.util.freetype.FT_Size_Metrics ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Size_Metrics.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Size_Metrics getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Size_Metrics r0 = org.lwjgl.util.freetype.FT_Size_Metrics.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short x_ppem() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Size_Metrics.nx_ppem(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UShort")
        public short y_ppem() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Size_Metrics.ny_ppem(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long x_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Metrics.nx_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Fixed")
        public long y_scale() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Metrics.ny_scale(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long ascender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Metrics.nascender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long descender() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Metrics.ndescender(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Metrics.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long max_advance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Metrics.nmax_advance(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Size_Metrics r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Size_Metrics$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Size_Metrics r0 = org.lwjgl.util.freetype.FT_Size_Metrics.create(r0)
                org.lwjgl.util.freetype.FT_Size_Metrics.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Size_Metrics(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Size_Metrics create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = new org.lwjgl.util.freetype.FT_Size_Metrics
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Size_Metrics(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short x_ppem() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nx_ppem(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UShort")
    public short y_ppem() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ny_ppem(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long x_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nx_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Fixed")
    public long y_scale() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ny_scale(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long ascender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nascender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long descender() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndescender(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long max_advance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmax_advance(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Metrics create(long r6) {
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = new org.lwjgl.util.freetype.FT_Size_Metrics
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size_Metrics createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = new org.lwjgl.util.freetype.FT_Size_Metrics
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Metrics.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Size_Metrics$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Metrics$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size_Metrics.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Size_Metrics$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Metrics$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static short nx_ppem(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Metrics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.X_PPEM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short ny_ppem(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Metrics.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.Y_PPEM
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static long nx_scale(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Metrics.X_SCALE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ny_scale(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Metrics.Y_SCALE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nascender(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Metrics.ASCENDER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long ndescender(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Metrics.DESCENDER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nheight(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Metrics.HEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nmax_advance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Metrics.MAX_ADVANCE
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
            org.lwjgl.util.freetype.FT_Size_Metrics r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.freetype.FT_Size_Metrics.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Size_Metrics.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Size_Metrics.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.X_PPEM = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.Y_PPEM = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.X_SCALE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.Y_SCALE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.ASCENDER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.DESCENDER = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.HEIGHT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Metrics.MAX_ADVANCE = r0
            return
    }
}
