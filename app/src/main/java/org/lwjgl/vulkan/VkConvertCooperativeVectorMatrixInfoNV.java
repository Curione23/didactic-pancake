package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConvertCooperativeVectorMatrixInfoNV.class */
public class VkConvertCooperativeVectorMatrixInfoNV extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SRCSIZE = 0;
    public static final int SRCDATA = 0;
    public static final int PDSTSIZE = 0;
    public static final int DSTDATA = 0;
    public static final int SRCCOMPONENTTYPE = 0;
    public static final int DSTCOMPONENTTYPE = 0;
    public static final int NUMROWS = 0;
    public static final int NUMCOLUMNS = 0;
    public static final int SRCLAYOUT = 0;
    public static final int SRCSTRIDE = 0;
    public static final int DSTLAYOUT = 0;
    public static final int DSTSTRIDE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkConvertCooperativeVectorMatrixInfoNV$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV, org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
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
        protected org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
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
        protected org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long srcSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR srcData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t *")
        public org.lwjgl.PointerBuffer pDstSize(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.npDstSize(r0, r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceOrHostAddressKHR dstData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeNV")
        public int srcComponentType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcComponentType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkComponentTypeNV")
        public int dstComponentType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstComponentType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numRows() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nnumRows(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int numColumns() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nnumColumns(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV")
        public int srcLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long srcStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV")
        public int dstLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstLayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long dstStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000491004(0x3ba247fc, float:0.004952429)
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer srcSize(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer srcData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer srcData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.srcData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer pDstSize(@org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.npDstSize(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer dstData(org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer dstData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r1 = r1.dstData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer srcComponentType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcComponentType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer dstComponentType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstComponentType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer numRows(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nnumRows(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer numColumns(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nnumColumns(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer srcLayout(@org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer srcStride(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.nsrcStride(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer dstLayout(@org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer dstStride(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ndstStride(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4165create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.create(r0)
                org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkConvertCooperativeVectorMatrixInfoNV(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkConvertCooperativeVectorMatrixInfoNV(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
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

    @org.lwjgl.system.NativeType("size_t")
    public long srcSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR srcData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = nsrcData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t *")
    public org.lwjgl.PointerBuffer pDstSize(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            org.lwjgl.PointerBuffer r0 = npDstSize(r0, r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceOrHostAddressKHR dstData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = ndstData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeNV")
    public int srcComponentType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcComponentType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkComponentTypeNV")
    public int dstComponentType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstComponentType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numRows() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumRows(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int numColumns() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnumColumns(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV")
    public int srcLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long srcStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV")
    public int dstLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstLayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long dstStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstStride(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000491004(0x3ba247fc, float:0.004952429)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV srcSize(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV srcData(org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV srcData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r1 = r1.srcData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV pDstSize(@org.lwjgl.system.NativeType("size_t *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDstSize(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV dstData(org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV dstData(java.util.function.Consumer<org.lwjgl.vulkan.VkDeviceOrHostAddressKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r1 = r1.dstData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV srcComponentType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcComponentType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV dstComponentType(@org.lwjgl.system.NativeType("VkComponentTypeNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstComponentType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV numRows(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumRows(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV numColumns(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnumColumns(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV srcLayout(@org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV srcStride(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV dstLayout(@org.lwjgl.system.NativeType("VkCooperativeVectorMatrixLayoutNV") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV dstStride(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstStride(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV set(int r5, long r6, long r8, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r10, org.lwjgl.PointerBuffer r11, org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r12, int r13, int r14, int r15, int r16, int r17, long r18, int r20, long r21) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.srcSize(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.srcData(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.pDstSize(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.dstData(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.srcComponentType(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.dstComponentType(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.numRows(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.numColumns(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.srcLayout(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.srcStride(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.dstLayout(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.dstStride(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV set(org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV malloc() {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV calloc() {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV create() {
            int r0 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV create(long r6) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
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

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer r0 = new org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsrcSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR nsrcData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.create(r0)
            return r0
    }

    public static org.lwjgl.PointerBuffer npDstSize(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.PDSTSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceOrHostAddressKHR ndstData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r0 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.create(r0)
            return r0
    }

    public static int nsrcComponentType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCCOMPONENTTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndstComponentType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTCOMPONENTTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnumRows(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.NUMROWS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnumColumns(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.NUMCOLUMNS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsrcLayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nsrcStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ndstLayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long ndstStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsrcSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsrcData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressConstKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npDstSize(long r5, org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.PDSTSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndstData(long r7, org.lwjgl.vulkan.VkDeviceOrHostAddressKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nsrcComponentType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCCOMPONENTTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndstComponentType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTCOMPONENTTYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnumRows(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.NUMROWS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nnumColumns(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.NUMCOLUMNS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsrcLayout(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsrcStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndstLayout(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTLAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndstStride(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 14
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDeviceOrHostAddressKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCSIZE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCDATA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.PDSTSIZE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTDATA = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCCOMPONENTTYPE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTCOMPONENTTYPE = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.NUMROWS = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.NUMCOLUMNS = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCLAYOUT = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.SRCSTRIDE = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTLAYOUT = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkConvertCooperativeVectorMatrixInfoNV.DSTSTRIDE = r0
            return
    }
}
