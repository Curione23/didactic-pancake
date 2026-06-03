package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT.class */
public class VkAccelerationStructureTrianglesOpacityMicromapEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int INDEXTYPE = 0;
    public static final int INDEXBUFFER = 0;
    public static final int INDEXSTRIDE = 0;
    public static final int BASETRIANGLE = 0;
    public static final int USAGECOUNTSCOUNT = 0;
    public static final int PUSAGECOUNTS = 0;
    public static final int PPUSAGECOUNTS = 0;
    public static final int MICROMAP = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT, org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndexType")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexType(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long indexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int baseTriangle() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nbaseTriangle(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int usageCountsCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nusageCountsCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *")
        public org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer pUsageCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.npUsageCounts(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *")
        public org.lwjgl.PointerBuffer ppUsageCounts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nppUsageCounts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkMicromapEXT")
        public long micromap() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nmicromap(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000396009(0x3ba0d4e9, float:0.0049081934)
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexBuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexBuffer()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nindexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer baseTriangle(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nbaseTriangle(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer usageCountsCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nusageCountsCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer pUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *") org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.npUsageCounts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer ppUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nppUsageCounts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer micromap(@org.lwjgl.system.NativeType("VkMicromapEXT") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.nmicromap(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureTrianglesOpacityMicromapEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureTrianglesOpacityMicromapEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkStructureType")
    public int sType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkIndexType")
    public int indexType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexType(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = nindexBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long indexStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindexStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int baseTriangle() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbaseTriangle(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int usageCountsCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusageCountsCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *")
    public org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer pUsageCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = npUsageCounts(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *")
    public org.lwjgl.PointerBuffer ppUsageCounts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppUsageCounts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkMicromapEXT")
    public long micromap() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmicromap(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000396009(0x3ba0d4e9, float:0.0049081934)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexBuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT indexBuffer(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexBuffer()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT baseTriangle(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbaseTriangle(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT usageCountsCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusageCountsCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT pUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const *") org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npUsageCounts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT ppUsageCounts(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkMicromapUsageEXT const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppUsageCounts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT micromap(@org.lwjgl.system.NativeType("VkMicromapEXT") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmicromap(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9, long r10, int r12, int r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r14, @javax.annotation.Nullable org.lwjgl.PointerBuffer r15, long r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.indexType(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.indexBuffer(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.indexStride(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.baseTriangle(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.usageCountsCount(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.pUsageCounts(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.ppUsageCounts(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.micromap(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT set(org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nindexType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nindexBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nindexStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbaseTriangle(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.BASETRIANGLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nusageCountsCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.USAGECOUNTSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer npUsageCounts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nusageCountsCount(r1)
            org.lwjgl.vulkan.VkMicromapUsageEXT$Buffer r0 = org.lwjgl.vulkan.VkMicromapUsageEXT.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppUsageCounts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PPUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nusageCountsCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static long nmicromap(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.MICROMAP
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nindexType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexBuffer(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXBUFFER
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindexStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbaseTriangle(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.BASETRIANGLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nusageCountsCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.USAGECOUNTSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npUsageCounts(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkMicromapUsageEXT.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nppUsageCounts(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PPUSAGECOUNTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmicromap(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.MICROMAP
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXTYPE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXBUFFER = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.INDEXSTRIDE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.BASETRIANGLE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.USAGECOUNTSCOUNT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PUSAGECOUNTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.PPUSAGECOUNTS = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT.MICROMAP = r0
            return
    }
}
