package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorMappingSourcePushIndexEXT.class */
public class VkDescriptorMappingSourcePushIndexEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int HEAPOFFSET = 0;
    public static final int PUSHOFFSET = 0;
    public static final int HEAPINDEXSTRIDE = 0;
    public static final int HEAPARRAYSTRIDE = 0;
    public static final int PEMBEDDEDSAMPLER = 0;
    public static final int USECOMBINEDIMAGESAMPLERINDEX = 0;
    public static final int SAMPLERHEAPOFFSET = 0;
    public static final int SAMPLERPUSHOFFSET = 0;
    public static final int SAMPLERHEAPINDEXSTRIDE = 0;
    public static final int SAMPLERHEAPARRAYSTRIDE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDescriptorMappingSourcePushIndexEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT, org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
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
        protected org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int heapOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nheapOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int pushOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.npushOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int heapIndexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nheapIndexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int heapArrayStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nheapArrayStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSamplerCreateInfo const *")
        public org.lwjgl.vulkan.VkSamplerCreateInfo pEmbeddedSampler() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSamplerCreateInfo r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.npEmbeddedSampler(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean useCombinedImageSamplerIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nuseCombinedImageSamplerIndex(r0)
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
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerPushOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerPushOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerHeapIndexStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapIndexStride(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerHeapArrayStride() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapArrayStride(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer heapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nheapOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer pushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.npushOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer heapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nheapIndexStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer heapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nheapArrayStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer pEmbeddedSampler(@org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.npEmbeddedSampler(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer useCombinedImageSamplerIndex(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nuseCombinedImageSamplerIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer samplerHeapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer samplerPushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerPushOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer samplerHeapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapIndexStride(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer samplerHeapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.nsamplerHeapArrayStride(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4390create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.create(r0)
                org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDescriptorMappingSourcePushIndexEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDescriptorMappingSourcePushIndexEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
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

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT heapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT pushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npushOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT heapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapIndexStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT heapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nheapArrayStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT pEmbeddedSampler(@org.lwjgl.system.NativeType("VkSamplerCreateInfo const *") org.lwjgl.vulkan.VkSamplerCreateInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npEmbeddedSampler(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT useCombinedImageSamplerIndex(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT samplerHeapOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerHeapOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT samplerPushOffset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerPushOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT samplerHeapIndexStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerHeapIndexStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT samplerHeapArrayStride(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamplerHeapArrayStride(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT set(int r4, int r5, int r6, int r7, org.lwjgl.vulkan.VkSamplerCreateInfo r8, boolean r9, int r10, int r11, int r12, int r13) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.heapOffset(r1)
            r0 = r3
            r1 = r5
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.pushOffset(r1)
            r0 = r3
            r1 = r6
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.heapIndexStride(r1)
            r0 = r3
            r1 = r7
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.heapArrayStride(r1)
            r0 = r3
            r1 = r8
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.pEmbeddedSampler(r1)
            r0 = r3
            r1 = r9
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.useCombinedImageSamplerIndex(r1)
            r0 = r3
            r1 = r10
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.samplerHeapOffset(r1)
            r0 = r3
            r1 = r11
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.samplerPushOffset(r1)
            r0 = r3
            r1 = r12
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.samplerHeapIndexStride(r1)
            r0 = r3
            r1 = r13
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.samplerHeapArrayStride(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT set(org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT malloc() {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT calloc() {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT create() {
            int r0 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT create(long r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer r0 = new org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nheapOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npushOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.PUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nheapIndexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nheapArrayStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPARRAYSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkSamplerCreateInfo npEmbeddedSampler(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.PEMBEDDEDSAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkSamplerCreateInfo r0 = org.lwjgl.vulkan.VkSamplerCreateInfo.createSafe(r0)
            return r0
    }

    public static int nuseCombinedImageSamplerIndex(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.USECOMBINEDIMAGESAMPLERINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerHeapOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerPushOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERPUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerHeapIndexStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerHeapArrayStride(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPARRAYSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nheapOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npushOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.PUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nheapIndexStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nheapArrayStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPARRAYSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npEmbeddedSampler(long r5, org.lwjgl.vulkan.VkSamplerCreateInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.PEMBEDDEDSAMPLER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nuseCombinedImageSamplerIndex(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.USECOMBINEDIMAGESAMPLERINDEX
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerHeapOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerPushOffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERPUSHOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerHeapIndexStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPINDEXSTRIDE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsamplerHeapArrayStride(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPARRAYSTRIDE
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
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.POINTER_SIZE
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
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPOFFSET = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.PUSHOFFSET = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPINDEXSTRIDE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.HEAPARRAYSTRIDE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.PEMBEDDEDSAMPLER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.USECOMBINEDIMAGESAMPLERINDEX = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPOFFSET = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERPUSHOFFSET = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPINDEXSTRIDE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDescriptorMappingSourcePushIndexEXT.SAMPLERHEAPARRAYSTRIDE = r0
            return
    }
}
