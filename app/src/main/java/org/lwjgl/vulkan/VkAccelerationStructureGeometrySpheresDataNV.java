package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometrySpheresDataNV.class */
public class VkAccelerationStructureGeometrySpheresDataNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV> implements org.lwjgl.system.NativeResource {
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

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometrySpheresDataNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV, org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
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
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int vertexFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nvertexFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR vertexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nvertexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long vertexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nvertexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int radiusFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nradiusFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR radiusData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nradiusData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long radiusStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nradiusStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndexType")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nindexType(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nindexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long indexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nindexStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000429010(0x3ba155d2, float:0.0049235607)
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nvertexFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nvertexData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.vertexData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nvertexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nradiusFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nradiusData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.radiusData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer radiusStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nradiusStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer indexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nindexData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer indexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.nindexStride(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3867create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureGeometrySpheresDataNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureGeometrySpheresDataNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
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

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000429010(0x3ba155d2, float:0.0049235607)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV vertexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV vertexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.vertexData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV radiusFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nradiusFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV radiusData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nradiusData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV radiusData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.radiusData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV radiusStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nradiusStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV indexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV indexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV indexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nindexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9, long r10, int r12, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r13, long r14, int r16, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r17, long r18) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.vertexFormat(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.vertexData(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.vertexStride(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.radiusFormat(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.radiusData(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.radiusStride(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.indexType(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.indexData(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.indexStride(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV set(org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nvertexFormat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXFORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nvertexData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nvertexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nradiusFormat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSFORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nradiusData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nradiusStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nindexType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nindexData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nindexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertexFormat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXFORMAT
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
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nvertexStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nradiusFormat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSFORMAT
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
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nradiusStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nindexType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXTYPE
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
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindexStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXSTRIDE
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
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXFORMAT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXDATA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.VERTEXSTRIDE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSFORMAT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSDATA = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.RADIUSSTRIDE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXTYPE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXDATA = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometrySpheresDataNV.INDEXSTRIDE = r0
            return
    }
}
