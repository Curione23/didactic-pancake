package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportSwizzleNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportSwizzleNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportSwizzleNV.class */
public class VkViewportSwizzleNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkViewportSwizzleNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int X = 0;
    public static final int Y = 0;
    public static final int Z = 0;
    public static final int W = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportSwizzleNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportSwizzleNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkViewportSwizzleNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkViewportSwizzleNV, org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkViewportSwizzleNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkViewportSwizzleNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkViewportSwizzleNV r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
        public int x() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.nx(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
        public int y() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.ny(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
        public int z() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.nz(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
        public int w() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.nw(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer x(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkViewportSwizzleNV.nx(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer y(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkViewportSwizzleNV.ny(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer z(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkViewportSwizzleNV.nz(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer w(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkViewportSwizzleNV.nw(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkViewportSwizzleNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkViewportSwizzleNV r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.create(r0)
                org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkViewportSwizzleNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkViewportSwizzleNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkViewportSwizzleNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
    public int x() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nx(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
    public int y() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ny(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
    public int z() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nz(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV")
    public int w() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nw(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkViewportSwizzleNV x(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nx(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkViewportSwizzleNV y(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ny(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkViewportSwizzleNV z(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nz(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkViewportSwizzleNV w(@org.lwjgl.system.NativeType("VkViewportCoordinateSwizzleNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nw(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkViewportSwizzleNV set(int r4, int r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = r0.x(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = r0.y(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = r0.z(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = r0.w(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkViewportSwizzleNV set(org.lwjgl.vulkan.VkViewportSwizzleNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV malloc() {
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV calloc() {
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV create() {
            int r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV create(long r6) {
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkViewportSwizzleNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
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

    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkViewportSwizzleNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer r0 = new org.lwjgl.vulkan.VkViewportSwizzleNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nx(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.X
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ny(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nz(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.Z
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nw(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.W
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nx(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.X
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ny(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.Y
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nz(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.Z
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nw(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkViewportSwizzleNV.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkViewportSwizzleNV.W
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
            org.lwjgl.vulkan.VkViewportSwizzleNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkViewportSwizzleNV.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkViewportSwizzleNV.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkViewportSwizzleNV.X = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkViewportSwizzleNV.Y = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkViewportSwizzleNV.Z = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkViewportSwizzleNV.W = r0
            return
    }
}
