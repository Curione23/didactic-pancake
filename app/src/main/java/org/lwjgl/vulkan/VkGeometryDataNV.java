package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryDataNV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryDataNV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryDataNV.class */
public class VkGeometryDataNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkGeometryDataNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TRIANGLES = 0;
    public static final int AABBS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryDataNV$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryDataNV$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkGeometryDataNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkGeometryDataNV, org.lwjgl.vulkan.VkGeometryDataNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkGeometryDataNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkGeometryDataNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkGeometryDataNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkGeometryDataNV r0 = org.lwjgl.vulkan.VkGeometryDataNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryTrianglesNV triangles() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = org.lwjgl.vulkan.VkGeometryDataNV.ntriangles(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryAABBNV aabbs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkGeometryAABBNV r0 = org.lwjgl.vulkan.VkGeometryDataNV.naabbs(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryDataNV.Buffer triangles(org.lwjgl.vulkan.VkGeometryTrianglesNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryDataNV.ntriangles(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryDataNV.Buffer triangles(java.util.function.Consumer<org.lwjgl.vulkan.VkGeometryTrianglesNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkGeometryTrianglesNV r1 = r1.triangles()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryDataNV.Buffer aabbs(org.lwjgl.vulkan.VkGeometryAABBNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkGeometryDataNV.naabbs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkGeometryDataNV.Buffer aabbs(java.util.function.Consumer<org.lwjgl.vulkan.VkGeometryAABBNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkGeometryAABBNV r1 = r1.aabbs()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeometryDataNV r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkGeometryDataNV r0 = org.lwjgl.vulkan.VkGeometryDataNV.create(r0)
                org.lwjgl.vulkan.VkGeometryDataNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkGeometryDataNV(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkGeometryDataNV create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkGeometryDataNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryTrianglesNV triangles() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = ntriangles(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryAABBNV aabbs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkGeometryAABBNV r0 = naabbs(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryDataNV triangles(org.lwjgl.vulkan.VkGeometryTrianglesNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntriangles(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryDataNV triangles(java.util.function.Consumer<org.lwjgl.vulkan.VkGeometryTrianglesNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkGeometryTrianglesNV r1 = r1.triangles()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryDataNV aabbs(org.lwjgl.vulkan.VkGeometryAABBNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naabbs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryDataNV aabbs(java.util.function.Consumer<org.lwjgl.vulkan.VkGeometryAABBNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkGeometryAABBNV r1 = r1.aabbs()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryDataNV set(org.lwjgl.vulkan.VkGeometryTrianglesNV r4, org.lwjgl.vulkan.VkGeometryAABBNV r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGeometryDataNV r0 = r0.triangles(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkGeometryDataNV r0 = r0.aabbs(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkGeometryDataNV set(org.lwjgl.vulkan.VkGeometryDataNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV malloc() {
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV calloc() {
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV create() {
            int r0 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV create(long r6) {
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkGeometryDataNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
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

    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryDataNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryDataNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkGeometryDataNV r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkGeometryDataNV r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkGeometryDataNV r0 = new org.lwjgl.vulkan.VkGeometryDataNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryDataNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkGeometryDataNV$Buffer r0 = new org.lwjgl.vulkan.VkGeometryDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkGeometryDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryTrianglesNV ntriangles(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeometryDataNV.TRIANGLES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkGeometryTrianglesNV r0 = org.lwjgl.vulkan.VkGeometryTrianglesNV.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkGeometryAABBNV naabbs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkGeometryDataNV.AABBS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkGeometryAABBNV r0 = org.lwjgl.vulkan.VkGeometryAABBNV.create(r0)
            return r0
    }

    public static void ntriangles(long r7, org.lwjgl.vulkan.VkGeometryTrianglesNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkGeometryDataNV.TRIANGLES
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void naabbs(long r7, org.lwjgl.vulkan.VkGeometryAABBNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkGeometryDataNV.AABBS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkGeometryAABBNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkGeometryDataNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 2
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkGeometryTrianglesNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkGeometryTrianglesNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkGeometryAABBNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkGeometryAABBNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkGeometryDataNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkGeometryDataNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryDataNV.TRIANGLES = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkGeometryDataNV.AABBS = r0
            return
    }
}
