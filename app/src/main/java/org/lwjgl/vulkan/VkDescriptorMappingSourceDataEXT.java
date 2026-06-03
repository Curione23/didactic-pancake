package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceDataEXT.class */
public class VkDescriptorMappingSourceDataEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int CONSTANTOFFSET = 0;
    public static final int PUSHINDEX = 0;
    public static final int INDIRECTINDEX = 0;
    public static final int INDIRECTINDEXARRAY = 0;
    public static final int HEAPDATA = 0;
    public static final int PUSHDATAOFFSET = 0;
    public static final int PUSHADDRESSOFFSET = 0;
    public static final int INDIRECTADDRESS = 0;
    public static final int SHADERRECORDINDEX = 0;
    public static final int SHADERRECORDDATAOFFSET = 0;
    public static final int SHADERRECORDADDRESSOFFSET = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceDataEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT, org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
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
        protected org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT constantOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nconstantOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT pushIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.npushIndex(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nindirectIndex(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nindirectIndexArray(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT heapData() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nheapData(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushDataOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.npushDataOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushAddressOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.npushAddressOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nindirectAddress(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nshaderRecordIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int shaderRecordDataOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nshaderRecordDataOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int shaderRecordAddressOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nshaderRecordAddressOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer constantOffset(org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nconstantOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer constantOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r1 = r1.constantOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer pushIndex(org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.npushIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer pushIndex(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r1 = r1.pushIndex()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer indirectIndex(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nindirectIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer indirectIndex(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r1 = r1.indirectIndex()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer indirectIndexArray(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nindirectIndexArray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer indirectIndexArray(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r1 = r1.indirectIndexArray()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer heapData(org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nheapData(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer heapData(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r1 = r1.heapData()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer pushDataOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.npushDataOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer pushAddressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.npushAddressOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer indirectAddress(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nindirectAddress(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer indirectAddress(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r1 = r1.indirectAddress()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer shaderRecordIndex(org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nshaderRecordIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer shaderRecordIndex(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r1 = r1.shaderRecordIndex()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer shaderRecordDataOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nshaderRecordDataOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer shaderRecordAddressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.nshaderRecordAddressOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4375create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.create(r0)
                org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorMappingSourceDataEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorMappingSourceDataEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT constantOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r0 = nconstantOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT pushIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = npushIndex(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT indirectIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = nindirectIndex(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT indirectIndexArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r0 = nindirectIndexArray(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT heapData() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r0 = nheapData(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pushDataOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushDataOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pushAddressOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushAddressOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT indirectAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r0 = nindirectAddress(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT shaderRecordIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r0 = nshaderRecordIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int shaderRecordDataOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRecordDataOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int shaderRecordAddressOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderRecordAddressOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT constantOffset(org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nconstantOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT constantOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r1 = r1.constantOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT pushIndex(org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT pushIndex(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r1 = r1.pushIndex()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT indirectIndex(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindirectIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT indirectIndex(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r1 = r1.indirectIndex()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT indirectIndexArray(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindirectIndexArray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT indirectIndexArray(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r1 = r1.indirectIndexArray()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT heapData(org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapData(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT heapData(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r1 = r1.heapData()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT pushDataOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushDataOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT pushAddressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushAddressOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT indirectAddress(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nindirectAddress(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT indirectAddress(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r1 = r1.indirectAddress()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT shaderRecordIndex(org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshaderRecordIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT shaderRecordIndex(java.util.function.Consumer<org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r1 = r1.shaderRecordIndex()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT shaderRecordDataOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshaderRecordDataOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT shaderRecordAddressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nshaderRecordAddressOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT set(org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT malloc() {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT calloc() {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT create(long r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT nconstantOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.CONSTANTOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT npushIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT nindirectIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT nindirectIndexArray(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTINDEXARRAY
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT nheapData(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.HEAPDATA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT.create(r0)
            return r0
    }

    public static int npushDataOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHDATAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npushAddressOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT nindirectAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT nshaderRecordIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT.create(r0)
            return r0
    }

    public static int nshaderRecordDataOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDDATAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nshaderRecordAddressOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nconstantOffset(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.CONSTANTOFFSET
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npushIndex(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHINDEX
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindirectIndex(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTINDEX
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nindirectIndexArray(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTINDEXARRAY
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nheapData(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.HEAPDATA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void npushDataOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHDATAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npushAddressOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nindirectAddress(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTADDRESS
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nshaderRecordIndex(long r7, org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDINDEX
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nshaderRecordDataOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDDATAOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nshaderRecordAddressOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDADDRESSOFFSET
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
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceConstantOffsetEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexArrayEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceHeapDataEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectAddressEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT.SIZEOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceShaderRecordIndexEXT.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            org.lwjgl.system.Struct$Layout r0 = __union(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.CONSTANTOFFSET = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHINDEX = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTINDEX = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTINDEXARRAY = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.HEAPDATA = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHDATAOFFSET = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.PUSHADDRESSOFFSET = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.INDIRECTADDRESS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDINDEX = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDDATAOFFSET = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceDataEXT.SHADERRECORDADDRESSOFFSET = r0
            return
    }
}
