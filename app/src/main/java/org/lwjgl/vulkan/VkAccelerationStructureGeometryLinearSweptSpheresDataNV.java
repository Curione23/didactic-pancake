package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryLinearSweptSpheresDataNV.class */
public class VkAccelerationStructureGeometryLinearSweptSpheresDataNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int VERTEXFORMAT = 0;
    public static final int VERTEXDATA = 0;
    public static final int VERTEXSTRIDE = 0;
    public static final int RADIUSFORMAT = 0;
    public static final int RADIUSDATA = 0;
    public static final int RADIUSSTRIDE = 0;
    public static final int INDEXTYPE = 0;
    public static final int INDEXDATA = 0;
    public static final int INDEXSTRIDE = 0;
    public static final int INDEXINGMODE = 0;
    public static final int ENDCAPSMODE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV, org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
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
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int vertexFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR vertexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long vertexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int radiusFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR radiusData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long radiusStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndexType")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexType(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long indexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRayTracingLssIndexingModeNV")
        public int indexingMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexingMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRayTracingLssPrimitiveEndCapsModeNV")
        public int endCapsMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nendCapsMode(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000429009(0x3ba155d1, float:0.00492356)
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.vertexData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nvertexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.radiusData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer radiusStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nradiusStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer indexingMode(@org.lwjgl.system.NativeType("VkRayTracingLssIndexingModeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nindexingMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer endCapsMode(@org.lwjgl.system.NativeType("VkRayTracingLssPrimitiveEndCapsModeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.nendCapsMode(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3862create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureGeometryLinearSweptSpheresDataNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureGeometryLinearSweptSpheresDataNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
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

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int vertexFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexFormat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR vertexData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = nvertexData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long vertexStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvertexStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int radiusFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nradiusFormat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR radiusData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = nradiusData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long radiusStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nradiusStride(r0)
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

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = nindexData(r0)
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

    @org.lwjgl.system.NativeType("VkRayTracingLssIndexingModeNV")
    public int indexingMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nindexingMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkRayTracingLssPrimitiveEndCapsModeNV")
    public int endCapsMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nendCapsMode(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000429009(0x3ba155d1, float:0.00492356)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.vertexData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nradiusFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nradiusData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.radiusData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV radiusStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nradiusStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV indexingMode(@org.lwjgl.system.NativeType("VkRayTracingLssIndexingModeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexingMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV endCapsMode(@org.lwjgl.system.NativeType("VkRayTracingLssPrimitiveEndCapsModeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nendCapsMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9, long r10, int r12, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r13, long r14, int r16, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r17, long r18, int r20, int r21) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.vertexFormat(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.vertexData(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.vertexStride(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.radiusFormat(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.radiusData(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.radiusStride(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.indexType(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.indexData(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.indexStride(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.indexingMode(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.endCapsMode(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV set(org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nvertexFormat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXFORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nvertexData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nvertexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nradiusFormat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSFORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nradiusData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nradiusStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nindexType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nindexData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nindexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nindexingMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXINGMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nendCapsMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ENDCAPSMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertexFormat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXFORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nvertexData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nvertexStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nradiusFormat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSFORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nradiusData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nradiusStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindexType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nindexData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindexStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindexingMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXINGMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nendCapsMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ENDCAPSMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXFORMAT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXDATA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.VERTEXSTRIDE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSFORMAT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSDATA = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.RADIUSSTRIDE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXTYPE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXDATA = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXSTRIDE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.INDEXINGMODE = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryLinearSweptSpheresDataNV.ENDCAPSMODE = r0
            return
    }
}
