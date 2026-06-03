package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR.class */
public class VkAccelerationStructureGeometryTrianglesDataKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int VERTEXFORMAT = 0;
    public static final int VERTEXDATA = 0;
    public static final int VERTEXSTRIDE = 0;
    public static final int MAXVERTEX = 0;
    public static final int INDEXTYPE = 0;
    public static final int INDEXDATA = 0;
    public static final int TRANSFORMDATA = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureGeometryTrianglesDataKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR, org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int vertexFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nvertexFormat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR vertexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nvertexData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long vertexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nvertexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxVertex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nmaxVertex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkIndexType")
        public int indexType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nindexType(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR indexData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nindexData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR transformData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ntransformData(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000150005(0x3b9d13f5, float:0.004793639)
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(org.lwjgl.vulkan.VkAccelerationStructureGeometryMotionTrianglesDataNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryMotionTrianglesDataNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer pNext(org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nvertexFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nvertexData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.vertexData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nvertexStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer maxVertex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nmaxVertex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nindexType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer indexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.nindexData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer indexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer transformData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ntransformData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer transformData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.transformData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureGeometryTrianglesDataKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureGeometryTrianglesDataKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxVertex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxVertex(r0)
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

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR transformData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ntransformData(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000150005(0x3b9d13f5, float:0.004793639)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR pNext(org.lwjgl.vulkan.VkAccelerationStructureGeometryMotionTrianglesDataNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryMotionTrianglesDataNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR pNext(org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesDisplacementMicromapNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR pNext(org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR vertexFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR vertexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvertexData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR vertexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.vertexData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR vertexStride(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvertexStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR maxVertex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxVertex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR indexType(@org.lwjgl.system.NativeType("VkIndexType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR indexData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindexData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR indexData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.indexData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR transformData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntransformData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR transformData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.transformData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9, long r10, int r12, int r13, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r14, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.vertexFormat(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.vertexData(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.vertexStride(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.maxVertex(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.indexType(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.indexData(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.transformData(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR set(org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nvertexFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nvertexData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long nvertexStride(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nmaxVertex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.MAXVERTEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nindexType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nindexData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.INDEXDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ntransformData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.TRANSFORMDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertexFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvertexData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nvertexStride(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXSTRIDE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nmaxVertex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.MAXVERTEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.INDEXTYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nindexData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.INDEXDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ntransformData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.TRANSFORMDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
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
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 9
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXFORMAT = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXDATA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.VERTEXSTRIDE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.MAXVERTEX = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.INDEXTYPE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.INDEXDATA = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureGeometryTrianglesDataKHR.TRANSFORMDATA = r0
            return
    }
}
