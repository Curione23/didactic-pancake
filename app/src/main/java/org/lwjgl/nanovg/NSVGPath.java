package org.lwjgl.nanovg;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPath.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPath.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPath.class */
@org.lwjgl.system.NativeType("struct NSVGpath")
public class NSVGPath extends org.lwjgl.system.Struct<org.lwjgl.nanovg.NSVGPath> {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int PTS = 0;
    public static final int NPTS = 0;
    public static final int CLOSED = 0;
    public static final int BOUNDS = 0;
    public static final int NEXT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPath$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPath$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/nanovg/NSVGPath$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.nanovg.NSVGPath, org.lwjgl.nanovg.NSVGPath.Buffer> {
        private static final org.lwjgl.nanovg.NSVGPath ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.nanovg.NSVGPath.SIZEOF
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
        protected org.lwjgl.nanovg.NSVGPath.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.nanovg.NSVGPath getElementFactory() {
                r2 = this;
                org.lwjgl.nanovg.NSVGPath r0 = org.lwjgl.nanovg.NSVGPath.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("float *")
        public java.nio.FloatBuffer pts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NSVGPath.npts(r0)
                return r0
        }

        public int npts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.nanovg.NSVGPath.nnpts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("char")
        public byte closed() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                byte r0 = org.lwjgl.nanovg.NSVGPath.nclosed(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("float[4]")
        public java.nio.FloatBuffer bounds() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.FloatBuffer r0 = org.lwjgl.nanovg.NSVGPath.nbounds(r0)
                return r0
        }

        public float bounds(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                float r0 = org.lwjgl.nanovg.NSVGPath.nbounds(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("NSVGpath *")
        public org.lwjgl.nanovg.NSVGPath next() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.nanovg.NSVGPath r0 = org.lwjgl.nanovg.NSVGPath.nnext(r0)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGPath r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.nanovg.NSVGPath$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.nanovg.NSVGPath r0 = org.lwjgl.nanovg.NSVGPath.create(r0)
                org.lwjgl.nanovg.NSVGPath.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected NSVGPath(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.nanovg.NSVGPath create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.nanovg.NSVGPath r0 = new org.lwjgl.nanovg.NSVGPath
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public NSVGPath(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGPath.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.nanovg.NSVGPath.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("float *")
    public java.nio.FloatBuffer pts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = npts(r0)
            return r0
    }

    public int npts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnpts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("char")
    public byte closed() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            byte r0 = nclosed(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("float[4]")
    public java.nio.FloatBuffer bounds() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.FloatBuffer r0 = nbounds(r0)
            return r0
    }

    public float bounds(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            float r0 = nbounds(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("NSVGpath *")
    public org.lwjgl.nanovg.NSVGPath next() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.nanovg.NSVGPath r0 = nnext(r0)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPath create(long r6) {
            org.lwjgl.nanovg.NSVGPath r0 = new org.lwjgl.nanovg.NSVGPath
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGPath createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGPath r0 = new org.lwjgl.nanovg.NSVGPath
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPath.Buffer create(long r6, int r8) {
            org.lwjgl.nanovg.NSVGPath$Buffer r0 = new org.lwjgl.nanovg.NSVGPath$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.nanovg.NSVGPath.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.nanovg.NSVGPath$Buffer r0 = new org.lwjgl.nanovg.NSVGPath$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static java.nio.FloatBuffer npts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGPath.PTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nnpts(r1)
            r2 = 1
            int r1 = r1 << r2
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static int nnpts(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGPath.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGPath.NPTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static byte nclosed(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGPath.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.nanovg.NSVGPath.CLOSED
            long r3 = (long) r3
            long r2 = r2 + r3
            byte r0 = r0.getByte(r1, r2)
            return r0
    }

    public static java.nio.FloatBuffer nbounds(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGPath.BOUNDS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 4
            java.nio.FloatBuffer r0 = org.lwjgl.system.MemoryUtil.memFloatBuffer(r0, r1)
            return r0
    }

    public static float nbounds(long r9, int r11) {
            sun.misc.Unsafe r0 = org.lwjgl.nanovg.NSVGPath.UNSAFE
            r1 = 0
            r2 = r9
            int r3 = org.lwjgl.nanovg.NSVGPath.BOUNDS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r11
            r4 = 4
            long r3 = org.lwjgl.system.Checks.check(r3, r4)
            r4 = 4
            long r3 = r3 * r4
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static org.lwjgl.nanovg.NSVGPath nnext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.nanovg.NSVGPath.NEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.nanovg.NSVGPath r0 = create(r0)
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.nanovg.NSVGPath r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.nanovg.NSVGPath.POINTER_SIZE
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
            r3 = 4
            r4 = 4
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.nanovg.NSVGPath.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.nanovg.NSVGPath.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.nanovg.NSVGPath.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPath.PTS = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPath.NPTS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPath.CLOSED = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPath.BOUNDS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.nanovg.NSVGPath.NEXT = r0
            return
    }
}
