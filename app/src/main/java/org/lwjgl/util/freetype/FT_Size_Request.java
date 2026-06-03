package org.lwjgl.util.freetype;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Request.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Request.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Request.class */
@org.lwjgl.system.NativeType("struct FT_Size_RequestRec")
public class FT_Size_Request extends org.lwjgl.system.Struct<org.lwjgl.util.freetype.FT_Size_Request> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TYPE = 0;
    public static final int WIDTH = 0;
    public static final int HEIGHT = 0;
    public static final int HORIRESOLUTION = 0;
    public static final int VERTRESOLUTION = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Request$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Request$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/freetype/FT_Size_Request$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.freetype.FT_Size_Request, org.lwjgl.util.freetype.FT_Size_Request.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.freetype.FT_Size_Request ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
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
        protected org.lwjgl.util.freetype.FT_Size_Request.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.freetype.FT_Size_Request getElementFactory() {
                r2 = this;
                org.lwjgl.util.freetype.FT_Size_Request r0 = org.lwjgl.util.freetype.FT_Size_Request.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Size_Request_Type")
        public int type() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Size_Request.ntype(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long width() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Request.nwidth(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_Long")
        public long height() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.freetype.FT_Size_Request.nheight(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int horiResolution() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Size_Request.nhoriResolution(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("FT_UInt")
        public int vertResolution() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.freetype.FT_Size_Request.nvertResolution(r0)
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Request.Buffer type(@org.lwjgl.system.NativeType("FT_Size_Request_Type") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Size_Request.ntype(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Request.Buffer width(@org.lwjgl.system.NativeType("FT_Long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Size_Request.nwidth(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Request.Buffer height(@org.lwjgl.system.NativeType("FT_Long") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.freetype.FT_Size_Request.nheight(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Request.Buffer horiResolution(@org.lwjgl.system.NativeType("FT_UInt") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Size_Request.nhoriResolution(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.freetype.FT_Size_Request.Buffer vertResolution(@org.lwjgl.system.NativeType("FT_UInt") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.freetype.FT_Size_Request.nvertResolution(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Size_Request r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.freetype.FT_Size_Request r0 = org.lwjgl.util.freetype.FT_Size_Request.create(r0)
                org.lwjgl.util.freetype.FT_Size_Request.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected FT_Size_Request(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.freetype.FT_Size_Request create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public FT_Size_Request(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Size_Request_Type")
    public int type() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntype(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long width() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nwidth(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_Long")
    public long height() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nheight(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int horiResolution() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhoriResolution(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("FT_UInt")
    public int vertResolution() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertResolution(r0)
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request type(@org.lwjgl.system.NativeType("FT_Size_Request_Type") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntype(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request width(@org.lwjgl.system.NativeType("FT_Long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nwidth(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request height(@org.lwjgl.system.NativeType("FT_Long") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nheight(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request horiResolution(@org.lwjgl.system.NativeType("FT_UInt") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nhoriResolution(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request vertResolution(@org.lwjgl.system.NativeType("FT_UInt") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertResolution(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request set(int r5, long r6, long r8, int r10, int r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.freetype.FT_Size_Request r0 = r0.type(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.freetype.FT_Size_Request r0 = r0.width(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.freetype.FT_Size_Request r0 = r0.height(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.freetype.FT_Size_Request r0 = r0.horiResolution(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.freetype.FT_Size_Request r0 = r0.vertResolution(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.freetype.FT_Size_Request set(org.lwjgl.util.freetype.FT_Size_Request r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request malloc() {
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            int r2 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request calloc() {
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request create() {
            int r0 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request create(long r6) {
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size_Request createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer malloc(int r6) {
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer calloc(int r7) {
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
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

    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer create(long r6, int r8) {
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.ALIGNOF
            int r4 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.freetype.FT_Size_Request r0 = new org.lwjgl.util.freetype.FT_Size_Request
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.freetype.FT_Size_Request.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.freetype.FT_Size_Request$Buffer r0 = new org.lwjgl.util.freetype.FT_Size_Request$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.freetype.FT_Size_Request.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int ntype(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Request.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nwidth(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Request.WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static long nheight(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Request.HEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetCLong(r0)
            return r0
    }

    public static int nhoriResolution(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Request.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.HORIRESOLUTION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvertResolution(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Request.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.VERTRESOLUTION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void ntype(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Request.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.TYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nwidth(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Request.WIDTH
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nheight(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.freetype.FT_Size_Request.HEIGHT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutCLong(r0, r1)
            return
    }

    public static void nhoriResolution(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Request.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.HORIRESOLUTION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertResolution(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.freetype.FT_Size_Request.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.VERTRESOLUTION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.freetype.FT_Size_Request r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.freetype.FT_Size_Request.CLONG_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.freetype.FT_Size_Request.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.freetype.FT_Size_Request.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Request.TYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Request.WIDTH = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Request.HEIGHT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Request.HORIRESOLUTION = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.freetype.FT_Size_Request.VERTRESOLUTION = r0
            return
    }
}
