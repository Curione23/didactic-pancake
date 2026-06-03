package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectIndexEXT.class */
public class VkDescriptorMappingSourceIndirectIndexEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int HEAPOFFSET = 0;
    public static final int PUSHOFFSET = 0;
    public static final int ADDRESSOFFSET = 0;
    public static final int HEAPINDEXSTRIDE = 0;
    public static final int HEAPARRAYSTRIDE = 0;
    public static final int PEMBEDDEDSAMPLER = 0;
    public static final int USECOMBINEDIMAGESAMPLERINDEX = 0;
    public static final int SAMPLERHEAPOFFSET = 0;
    public static final int SAMPLERPUSHOFFSET = 0;
    public static final int SAMPLERADDRESSOFFSET = 0;
    public static final int SAMPLERHEAPINDEXSTRIDE = 0;
    public static final int SAMPLERHEAPARRAYSTRIDE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorMappingSourceIndirectIndexEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT, org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
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
        protected org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int heapOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nheapOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.npushOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int addressOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.naddressOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int heapIndexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nheapIndexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int heapArrayStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nheapArrayStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerCreateInfo const *")
        public org.lwjgl.vulkan.VkSamplerCreateInfo pEmbeddedSampler() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.npEmbeddedSampler(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nuseCombinedImageSamplerIndex(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerHeapOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerPushOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerPushOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerAddressOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerAddressOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerHeapIndexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapIndexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerHeapArrayStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapArrayStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer heapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nheapOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer pushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.npushOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer addressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.naddressOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer heapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nheapIndexStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer heapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nheapArrayStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer pEmbeddedSampler(@org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.npEmbeddedSampler(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer useCombinedImageSamplerIndex(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nuseCombinedImageSamplerIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerHeapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerPushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerPushOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerAddressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerAddressOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerHeapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapIndexStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer samplerHeapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.nsamplerHeapArrayStride(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4387create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.create(r0)
                org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorMappingSourceIndirectIndexEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorMappingSourceIndirectIndexEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int heapOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheapOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int pushOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npushOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int addressOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = naddressOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int heapIndexStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheapIndexStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int heapArrayStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nheapArrayStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSamplerCreateInfo const *")
    public org.lwjgl.vulkan.VkSamplerCreateInfo pEmbeddedSampler() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = npEmbeddedSampler(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean useCombinedImageSamplerIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuseCombinedImageSamplerIndex(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int samplerHeapOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerHeapOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int samplerPushOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerPushOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int samplerAddressOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerAddressOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int samplerHeapIndexStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerHeapIndexStride(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int samplerHeapArrayStride() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerHeapArrayStride(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT heapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT pushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT addressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            naddressOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT heapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapIndexStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT heapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapArrayStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT pEmbeddedSampler(@org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npEmbeddedSampler(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT useCombinedImageSamplerIndex(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nuseCombinedImageSamplerIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT samplerHeapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerHeapOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT samplerPushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerPushOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT samplerAddressOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerAddressOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT samplerHeapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerHeapIndexStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT samplerHeapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerHeapArrayStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT set(int r4, int r5, int r6, int r7, int r8, org.lwjgl.vulkan.VkSamplerCreateInfo r9, boolean r10, int r11, int r12, int r13, int r14, int r15) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.heapOffset(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.pushOffset(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.addressOffset(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.heapIndexStride(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.heapArrayStride(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.pEmbeddedSampler(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.useCombinedImageSamplerIndex(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.samplerHeapOffset(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.samplerPushOffset(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.samplerAddressOffset(r1)
            r0 = r3
            r1 = r14
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.samplerHeapIndexStride(r1)
            r0 = r3
            r1 = r15
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.samplerHeapArrayStride(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT set(org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT malloc() {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT calloc() {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT create(long r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nheapOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npushOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.PUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int naddressOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nheapIndexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nheapArrayStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPARRAYSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo npEmbeddedSampler(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.PEMBEDDEDSAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.createSafe(r0)
            return r0
    }

    public static int nuseCombinedImageSamplerIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.USECOMBINEDIMAGESAMPLERINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerHeapOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerPushOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERPUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerAddressOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerHeapIndexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerHeapArrayStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPARRAYSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nheapOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npushOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.PUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void naddressOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nheapIndexStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nheapArrayStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPARRAYSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npEmbeddedSampler(long r5, org.lwjgl.vulkan.VkSamplerCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.PEMBEDDEDSAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nuseCombinedImageSamplerIndex(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.USECOMBINEDIMAGESAMPLERINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerHeapOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerPushOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERPUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerAddressOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERADDRESSOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerHeapIndexStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerHeapArrayStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPARRAYSTRIDE
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
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 12
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPOFFSET = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.PUSHOFFSET = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.ADDRESSOFFSET = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPINDEXSTRIDE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.HEAPARRAYSTRIDE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.PEMBEDDEDSAMPLER = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.USECOMBINEDIMAGESAMPLERINDEX = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPOFFSET = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERPUSHOFFSET = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERADDRESSOFFSET = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPINDEXSTRIDE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourceIndirectIndexEXT.SAMPLERHEAPARRAYSTRIDE = r0
            return
    }
}
