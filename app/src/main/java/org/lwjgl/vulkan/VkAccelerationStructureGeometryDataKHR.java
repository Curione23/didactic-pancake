package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR.class */
public class VkAccelerationStructureGeometryDataKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int TRIANGLES = 0;
    public static final int AABBS = 0;
    public static final int INSTANCES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryDataKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR, org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ntriangles(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.naabbs(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR instances() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ninstances(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer triangles(org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ntriangles(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer triangles(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r1 = r1.triangles()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer aabbs(org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.naabbs(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer aabbs(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r1 = r1.aabbs()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer instances(org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ninstances(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer instances(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r1 = r1.instances()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureGeometryDataKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureGeometryDataKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR triangles() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = ntriangles(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR aabbs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r0 = naabbs(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR instances() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r0 = ninstances(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR triangles(org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntriangles(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR triangles(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r1 = r1.triangles()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR aabbs(org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naabbs(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR aabbs(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r1 = r1.aabbs()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR instances(org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstances(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR instances(java.util.function.Consumer<org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r1 = r1.instances()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR set(org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR ntriangles(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.TRIANGLES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR naabbs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.AABBS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR ninstances(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.INSTANCES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR.create(r0)
            return r0
    }

    public static void ntriangles(long r7, org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.TRIANGLES
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void naabbs(long r7, org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.AABBS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ninstances(long r7, org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.INSTANCES
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF
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
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometryAabbsDataKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometryInstancesDataKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.TRIANGLES = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.AABBS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryDataKHR.INSTANCES = r0
            return
    }
}
