package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_BBox.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_BBox.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_BBox.class */
public class FT_BBox extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_BBox> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int XMIN = 0;
    public static final int YMIN = 0;
    public static final int XMAX = 0;
    public static final int YMAX = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_BBox$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_BBox$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_BBox$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_BBox, org.lwjgl.util.freetype.FT_BBox.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_BBox ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_BBox.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_BBox getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_BBox r0 = org.lwjgl.util.freetype.FT_BBox.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long xMin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_BBox.nxMin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long yMin() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_BBox.nyMin(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long xMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_BBox.nxMax(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Pos")
        public long yMax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_BBox.nyMax(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_BBox.Buffer xMin(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_BBox.nxMin(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_BBox.Buffer yMin(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_BBox.nyMin(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_BBox.Buffer xMax(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_BBox.nxMax(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_BBox.Buffer yMax(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_BBox.nyMax(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_BBox r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_BBox$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_BBox r0 = org.lwjgl.util.freetype.FT_BBox.create(r0)
                org.lwjgl.util.freetype.FT_BBox.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_BBox(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_BBox create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_BBox(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long xMin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nxMin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long yMin() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nyMin(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long xMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nxMax(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Pos")
    public long yMax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nyMax(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox xMin(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nxMin(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox yMin(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nyMin(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox xMax(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nxMax(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox yMax(@org.lwjgl.system.NativeType("FT_Pos") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nyMax(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox set(long r5, long r7, long r9, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_BBox r0 = r0.xMin(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.freetype.FT_BBox r0 = r0.yMin(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.freetype.FT_BBox r0 = r0.xMax(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.freetype.FT_BBox r0 = r0.yMax(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_BBox set(org.lwjgl.util.freetype.FT_BBox r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox malloc() {
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox calloc() {
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox create() {
            int r0 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox create(long r6) {
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_BBox createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = -1
            r5 = 0
            r6 = r10
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_BBox.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_BBox.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_BBox r0 = new org.lwjgl.util.freetype.FT_BBox
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_BBox.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_BBox.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_BBox.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_BBox$Buffer r0 = new org.lwjgl.util.freetype.FT_BBox$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_BBox.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_BBox.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nxMin(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.XMIN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nyMin(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.YMIN
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nxMax(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.XMAX
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nyMax(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.YMAX
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static void nxMin(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.XMIN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nyMin(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.YMIN
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nxMax(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.XMAX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nyMax(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_BBox.YMAX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_BBox r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.freetype.FT_BBox.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_BBox.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_BBox.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_BBox.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_BBox.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_BBox.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_BBox.XMIN = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_BBox.YMIN = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_BBox.XMAX = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_BBox.YMAX = r0
            return
    }
}
