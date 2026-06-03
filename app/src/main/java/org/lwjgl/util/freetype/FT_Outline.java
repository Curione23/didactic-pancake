package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline.class */
public class FT_Outline extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Outline> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int N_CONTOURS = 0;
    public static final int N_POINTS = 0;
    public static final int POINTS = 0;
    public static final int TAGS = 0;
    public static final int CONTOURS = 0;
    public static final int FLAGS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Outline$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Outline, org.lwjgl.util.freetype.FT_Outline.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Outline ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Outline.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Outline getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Outline r0 = org.lwjgl.util.freetype.FT_Outline.Buffer.ELEMENT_FACTORY
                return r0
        }

        public short n_contours() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Outline.nn_contours(r0)
                return r0
        }

        public short n_points() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.util.freetype.FT_Outline.nn_points(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Vector *")
        public org.lwjgl.util.freetype.FT_Vector.Buffer points() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.util.freetype.FT_Vector$Buffer r0 = org.lwjgl.util.freetype.FT_Outline.npoints(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char *")
        public java.nio.ByteBuffer tags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.util.freetype.FT_Outline.ntags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("short *")
        public java.nio.ShortBuffer contours() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ShortBuffer r0 = org.lwjgl.util.freetype.FT_Outline.ncontours(r0)
                return r0
        }

        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Outline.nflags(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Outline r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Outline$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Outline r0 = org.lwjgl.util.freetype.FT_Outline.create(r0)
                org.lwjgl.util.freetype.FT_Outline.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Outline(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Outline create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Outline(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            return r0
    }

    public short n_contours() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nn_contours(r0)
            return r0
    }

    public short n_points() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nn_points(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Vector *")
    public org.lwjgl.util.freetype.FT_Vector.Buffer points() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.freetype.FT_Vector$Buffer r0 = npoints(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char *")
    public java.nio.ByteBuffer tags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = ntags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("short *")
    public java.nio.ShortBuffer contours() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ShortBuffer r0 = ncontours(r0)
            return r0
    }

    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline malloc() {
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline calloc() {
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline create() {
            int r0 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline create(long r6) {
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Outline createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
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

    public static org.lwjgl.util.freetype.FT_Outline.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Outline.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Outline.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Outline r0 = new org.lwjgl.util.freetype.FT_Outline
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Outline.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Outline.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Outline.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Outline$Buffer r0 = new org.lwjgl.util.freetype.FT_Outline$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Outline.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Outline.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static short nn_contours(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Outline.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Outline.N_CONTOURS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static short nn_points(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Outline.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Outline.N_POINTS
            long r3 = (long) r3
            long r2 = r2 + r3
            short r0 = r0.getShort(r1, r2)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Vector.Buffer npoints(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Outline.POINTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            short r1 = nn_points(r1)
            org.lwjgl.util.freetype.FT_Vector$Buffer r0 = org.lwjgl.util.freetype.FT_Vector.create(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer ntags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Outline.TAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            short r1 = nn_points(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static java.nio.ShortBuffer ncontours(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Outline.CONTOURS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            short r1 = nn_contours(r1)
            java.nio.ShortBuffer r0 = org.lwjgl.system.MemoryUtil.memShortBuffer(r0, r1)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Outline.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Outline.FLAGS
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
            org.lwjgl.util.freetype.FT_Outline r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
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
            int r3 = org.lwjgl.util.freetype.FT_Outline.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.freetype.FT_Outline.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.freetype.FT_Outline.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Outline.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Outline.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Outline.N_CONTOURS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Outline.N_POINTS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Outline.POINTS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Outline.TAGS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Outline.CONTOURS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Outline.FLAGS = r0
            return
    }
}
