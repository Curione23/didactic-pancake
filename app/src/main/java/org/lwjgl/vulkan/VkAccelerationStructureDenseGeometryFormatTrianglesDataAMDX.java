package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.class */
public class VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int COMPRESSEDDATA = 0;
    public static final int DATASIZE = 0;
    public static final int NUMTRIANGLES = 0;
    public static final int NUMVERTICES = 0;
    public static final int MAXPRIMITIVEINDEX = 0;
    public static final int MAXGEOMETRYINDEX = 0;
    public static final int FORMAT = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX, org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
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
        protected org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
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
        protected org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.npNext(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR compressedData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ncompressedData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long dataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ndataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numTriangles() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumTriangles(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numVertices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumVertices(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPrimitiveIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxPrimitiveIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxGeometryIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxGeometryIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkCompressedTriangleFormatAMDX")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nformat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000478001(0x3ba21531, float:0.004946374)
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer pNext(org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer compressedData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ncompressedData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer compressedData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.compressedData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer dataSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ndataSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer numTriangles(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumTriangles(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer numVertices(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nnumVertices(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer maxPrimitiveIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxPrimitiveIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer maxGeometryIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nmaxGeometryIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer format(@org.lwjgl.system.NativeType("VkCompressedTriangleFormatAMDX") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.nformat(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m3849create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.create(r0)
                org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
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

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR compressedData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = ncompressedData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long dataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numTriangles() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumTriangles(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numVertices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumVertices(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPrimitiveIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPrimitiveIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxGeometryIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxGeometryIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkCompressedTriangleFormatAMDX")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000478001(0x3ba21531, float:0.004946374)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX pNext(org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAccelerationStructureTrianglesOpacityMicromapEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncompressedData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX compressedData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.compressedData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX dataSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndataSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numTriangles(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumTriangles(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX numVertices(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumVertices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxPrimitiveIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxPrimitiveIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX maxGeometryIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmaxGeometryIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX format(@org.lwjgl.system.NativeType("VkCompressedTriangleFormatAMDX") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX set(int r5, long r6, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r8, long r9, int r11, int r12, int r13, int r14, int r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.compressedData(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.dataSize(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.numTriangles(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.numVertices(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.maxPrimitiveIndex(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.maxGeometryIndex(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.format(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX set(org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX malloc() {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX calloc() {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create() {
            int r0 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX create(long r6) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
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

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer r0 = new org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR ncompressedData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.COMPRESSEDDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static long ndataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.DATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nnumTriangles(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMTRIANGLES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnumVertices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMVERTICES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxPrimitiveIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXPRIMITIVEINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxGeometryIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXGEOMETRYINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nformat(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.FORMAT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ncompressedData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.COMPRESSEDDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void ndataSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.DATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nnumTriangles(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMTRIANGLES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnumVertices(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMVERTICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxPrimitiveIndex(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXPRIMITIVEINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nmaxGeometryIndex(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXGEOMETRYINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nformat(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.FORMAT
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
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.COMPRESSEDDATA = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.DATASIZE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMTRIANGLES = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.NUMVERTICES = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXPRIMITIVEINDEX = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.MAXGEOMETRYINDEX = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkAccelerationStructureDenseGeometryFormatTrianglesDataAMDX.FORMAT = r0
            return
    }
}
