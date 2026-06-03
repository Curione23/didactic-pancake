package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGPoint.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGPoint.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGPoint.class */
public class CGPoint extends org.lwjgl.system.Struct<org.lwjgl.system.macosx.CGPoint> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int X = 0;
    public static final int Y = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGPoint$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGPoint$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/CGPoint$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.system.macosx.CGPoint, org.lwjgl.system.macosx.CGPoint.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.system.macosx.CGPoint ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.system.macosx.CGPoint.SIZEOF
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
        protected org.lwjgl.system.macosx.CGPoint.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.system.macosx.CGPoint getElementFactory() {
                r2 = this;
                org.lwjgl.system.macosx.CGPoint r0 = org.lwjgl.system.macosx.CGPoint.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("CGFloat")
        public double x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.system.macosx.CGPoint.nx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("CGFloat")
        public double y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                double r0 = org.lwjgl.system.macosx.CGPoint.ny(r0)
                return r0
        }

        public org.lwjgl.system.macosx.CGPoint.Buffer x(@org.lwjgl.system.NativeType("CGFloat") double r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.macosx.CGPoint.nx(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.system.macosx.CGPoint.Buffer y(@org.lwjgl.system.NativeType("CGFloat") double r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.system.macosx.CGPoint.ny(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.macosx.CGPoint r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.system.macosx.CGPoint$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.system.macosx.CGPoint r0 = org.lwjgl.system.macosx.CGPoint.create(r0)
                org.lwjgl.system.macosx.CGPoint.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected CGPoint(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.system.macosx.CGPoint create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public CGPoint(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("CGFloat")
    public double x() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = nx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("CGFloat")
    public double y() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            double r0 = ny(r0)
            return r0
    }

    public org.lwjgl.system.macosx.CGPoint x(@org.lwjgl.system.NativeType("CGFloat") double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nx(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.macosx.CGPoint y(@org.lwjgl.system.NativeType("CGFloat") double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ny(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.system.macosx.CGPoint set(double r5, double r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.system.macosx.CGPoint r0 = r0.x(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.system.macosx.CGPoint r0 = r0.y(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.system.macosx.CGPoint set(org.lwjgl.system.macosx.CGPoint r7) {
            r6 = this;
            r0 = r7
            long r0 = r0.address()
            r1 = r6
            long r1 = r1.address()
            int r2 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r6
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint malloc() {
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            int r2 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint calloc() {
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint create() {
            int r0 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint create(long r6) {
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.macosx.CGPoint createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint.Buffer malloc(int r6) {
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint.Buffer calloc(int r7) {
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
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

    public static org.lwjgl.system.macosx.CGPoint.Buffer create(long r6, int r8) {
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.macosx.CGPoint.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGPoint r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGPoint r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.macosx.CGPoint r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.system.macosx.CGPoint r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.system.macosx.CGPoint.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.system.macosx.CGPoint.ALIGNOF
            int r4 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.system.macosx.CGPoint r0 = new org.lwjgl.system.macosx.CGPoint
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGPoint.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.macosx.CGPoint.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.system.macosx.CGPoint.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.system.macosx.CGPoint$Buffer r0 = new org.lwjgl.system.macosx.CGPoint$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.system.macosx.CGPoint.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.system.macosx.CGPoint.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static double nx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGPoint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGPoint.X
            long r3 = (long) r3
            long r2 = r2 + r3
            double r0 = r0.getDouble(r1, r2)
            return r0
    }

    public static double ny(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGPoint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGPoint.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            double r0 = r0.getDouble(r1, r2)
            return r0
    }

    public static void nx(long r7, double r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGPoint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGPoint.X
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putDouble(r1, r2, r3)
            return
    }

    public static void ny(long r7, double r9) {
            sun.misc.Unsafe r0 = org.lwjgl.system.macosx.CGPoint.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.system.macosx.CGPoint.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putDouble(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.system.macosx.CGPoint r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.system.macosx.CGPoint.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.system.macosx.CGPoint.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGPoint.X = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.system.macosx.CGPoint.Y = r0
            return
    }
}
