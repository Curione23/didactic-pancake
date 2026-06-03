package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureBuildTriangleClusterInfoNV.class */
public class VkClusterAccelerationStructureBuildTriangleClusterInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CLUSTERID = 0;
    public static final int CLUSTERFLAGS = 0;
    public static final int BITFIELD0 = 0;
    public static final int BASEGEOMETRYINDEXANDGEOMETRYFLAGS = 0;
    public static final int INDEXBUFFERSTRIDE = 0;
    public static final int VERTEXBUFFERSTRIDE = 0;
    public static final int GEOMETRYINDEXANDFLAGSBUFFERSTRIDE = 0;
    public static final int OPACITYMICROMAPINDEXBUFFERSTRIDE = 0;
    public static final int INDEXBUFFER = 0;
    public static final int VERTEXBUFFER = 0;
    public static final int GEOMETRYINDEXANDFLAGSBUFFER = 0;
    public static final int OPACITYMICROMAPARRAY = 0;
    public static final int OPACITYMICROMAPINDEXBUFFER = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV, org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int clusterID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkClusterAccelerationStructureClusterFlagsNV")
        public int clusterFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int triangleCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ntriangleCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vertexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int positionTruncateBitCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.npositionTruncateBitCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int opacityMicromapIndexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexType(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nbaseGeometryIndexAndGeometryFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short indexBufferStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBufferStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short vertexBufferStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBufferStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short geometryIndexAndFlagsBufferStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBufferStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint16_t")
        public short opacityMicromapIndexBufferStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                short r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBufferStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long indexBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long vertexBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long geometryIndexAndFlagsBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long opacityMicromapArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapArray(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long opacityMicromapIndexBuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBuffer(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer clusterID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterID(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer clusterFlags(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureClusterFlagsNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nclusterFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer triangleCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ntriangleCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer vertexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer positionTruncateBitCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.npositionTruncateBitCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer indexType(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapIndexType(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer baseGeometryIndexAndGeometryFlags(org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nbaseGeometryIndexAndGeometryFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer baseGeometryIndexAndGeometryFlags(java.util.function.Consumer<org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r1 = r1.baseGeometryIndexAndGeometryFlags()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer indexBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBufferStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer vertexBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBufferStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer geometryIndexAndFlagsBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBufferStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapIndexBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBufferStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer indexBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nindexBuffer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer vertexBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nvertexBuffer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer geometryIndexAndFlagsBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ngeometryIndexAndFlagsBuffer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapArray(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapArray(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer opacityMicromapIndexBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.nopacityMicromapIndexBuffer(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4084create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.create(r0)
                org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkClusterAccelerationStructureBuildTriangleClusterInfoNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkClusterAccelerationStructureBuildTriangleClusterInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int clusterID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclusterID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkClusterAccelerationStructureClusterFlagsNV")
    public int clusterFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclusterFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int triangleCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntriangleCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vertexCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int positionTruncateBitCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npositionTruncateBitCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int indexType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int opacityMicromapIndexType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nopacityMicromapIndexType(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = nbaseGeometryIndexAndGeometryFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short indexBufferStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nindexBufferStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short vertexBufferStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nvertexBufferStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short geometryIndexAndFlagsBufferStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = ngeometryIndexAndFlagsBufferStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint16_t")
    public short opacityMicromapIndexBufferStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            short r0 = nopacityMicromapIndexBufferStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long indexBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nindexBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long vertexBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvertexBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long geometryIndexAndFlagsBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ngeometryIndexAndFlagsBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long opacityMicromapArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nopacityMicromapArray(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long opacityMicromapIndexBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nopacityMicromapIndexBuffer(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterID(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclusterID(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV clusterFlags(@org.lwjgl.system.NativeType("VkClusterAccelerationStructureClusterFlagsNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclusterFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV triangleCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntriangleCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV positionTruncateBitCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npositionTruncateBitCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexType(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexType(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopacityMicromapIndexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbaseGeometryIndexAndGeometryFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV baseGeometryIndexAndGeometryFlags(java.util.function.Consumer<org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r1 = r1.baseGeometryIndexAndGeometryFlags()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexBufferStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexBufferStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ngeometryIndexAndFlagsBufferStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBufferStride(@org.lwjgl.system.NativeType("uint16_t") short r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nopacityMicromapIndexBufferStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV indexBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV vertexBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV geometryIndexAndFlagsBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ngeometryIndexAndFlagsBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapArray(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nopacityMicromapArray(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV opacityMicromapIndexBuffer(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nopacityMicromapIndexBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(int r5, int r6, int r7, int r8, int r9, int r10, int r11, org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r12, short r13, short r14, short r15, short r16, long r17, long r19, long r21, long r23, long r25) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.clusterID(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.clusterFlags(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.triangleCount(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.vertexCount(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.positionTruncateBitCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.indexType(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.opacityMicromapIndexType(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.baseGeometryIndexAndGeometryFlags(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.indexBufferStride(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.vertexBufferStride(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.geometryIndexAndFlagsBufferStride(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.opacityMicromapIndexBufferStride(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.indexBuffer(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.vertexBuffer(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.geometryIndexAndFlagsBuffer(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.opacityMicromapArray(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.opacityMicromapIndexBuffer(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV set(org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV malloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV calloc() {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV create(long r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nclusterID(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERID
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nclusterFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nbitfield0(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ntriangleCount(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 511(0x1ff, float:7.16E-43)
            r0 = r0 & r1
            return r0
    }

    public static int nvertexCount(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 261632(0x3fe00, float:3.66625E-40)
            r0 = r0 & r1
            r1 = 9
            int r0 = r0 >>> r1
            return r0
    }

    public static int npositionTruncateBitCount(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 16515072(0xfc0000, float:2.3142545E-38)
            r0 = r0 & r1
            r1 = 18
            int r0 = r0 >>> r1
            return r0
    }

    public static int nindexType(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 251658240(0xf000000, float:6.3108872E-30)
            r0 = r0 & r1
            r1 = 24
            int r0 = r0 >>> r1
            return r0
    }

    public static int nopacityMicromapIndexType(long r3) {
            r0 = r3
            int r0 = nbitfield0(r0)
            r1 = 28
            int r0 = r0 >>> r1
            return r0
    }

    public static org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV nbaseGeometryIndexAndGeometryFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r0 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.create(r0)
            return r0
    }

    public static short nindexBufferStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short nvertexBufferStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short ngeometryIndexAndFlagsBufferStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static short nopacityMicromapIndexBufferStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            short r0 = org.lwjgl.system.MemoryUtil.memGetShort(r0)
            return r0
    }

    public static long nindexBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nvertexBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ngeometryIndexAndFlagsBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nopacityMicromapArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nopacityMicromapIndexBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nclusterID(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nclusterFlags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nbitfield0(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BITFIELD0
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ntriangleCount(long r6, int r8) {
            r0 = r6
            r1 = r6
            int r1 = nbitfield0(r1)
            r2 = -512(0xfffffffffffffe00, float:NaN)
            r1 = r1 & r2
            r2 = r8
            r3 = 511(0x1ff, float:7.16E-43)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nvertexCount(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 9
            int r1 = r1 << r2
            r2 = 261632(0x3fe00, float:3.66625E-40)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -261633(0xfffffffffffc01ff, float:NaN)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void npositionTruncateBitCount(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 18
            int r1 = r1 << r2
            r2 = 16515072(0xfc0000, float:2.3142545E-38)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -16515073(0xffffffffff03ffff, float:-1.7545808E38)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nindexType(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 24
            int r1 = r1 << r2
            r2 = 251658240(0xf000000, float:6.3108872E-30)
            r1 = r1 & r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = -251658241(0xfffffffff0ffffff, float:-6.3382526E29)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nopacityMicromapIndexType(long r6, int r8) {
            r0 = r6
            r1 = r8
            r2 = 28
            int r1 = r1 << r2
            r2 = r6
            int r2 = nbitfield0(r2)
            r3 = 268435455(0xfffffff, float:2.5243547E-29)
            r2 = r2 & r3
            r1 = r1 | r2
            nbitfield0(r0, r1)
            return
    }

    public static void nbaseGeometryIndexAndGeometryFlags(long r7, org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindexBufferStride(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nvertexBufferStride(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void ngeometryIndexAndFlagsBufferStride(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nopacityMicromapIndexBufferStride(long r5, short r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutShort(r0, r1)
            return
    }

    public static void nindexBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nvertexBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ngeometryIndexAndFlagsBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nopacityMicromapArray(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nopacityMicromapIndexBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 13
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
            int r3 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.SIZEOF
            int r4 = org.lwjgl.vulkan.VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 2
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERID = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.CLUSTERFLAGS = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BITFIELD0 = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.BASEGEOMETRYINDEXANDGEOMETRYFLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFERSTRIDE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFERSTRIDE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFERSTRIDE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFERSTRIDE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.INDEXBUFFER = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.VERTEXBUFFER = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.GEOMETRYINDEXANDFLAGSBUFFER = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPARRAY = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkClusterAccelerationStructureBuildTriangleClusterInfoNV.OPACITYMICROMAPINDEXBUFFER = r0
            return
    }
}
