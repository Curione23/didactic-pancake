package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Properties.class */
public class VkPhysicalDeviceVulkan14Properties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int LINESUBPIXELPRECISIONBITS = 0;
    public static final int MAXVERTEXATTRIBDIVISOR = 0;
    public static final int SUPPORTSNONZEROFIRSTINSTANCE = 0;
    public static final int MAXPUSHDESCRIPTORS = 0;
    public static final int DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS = 0;
    public static final int DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS = 0;
    public static final int EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING = 0;
    public static final int EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING = 0;
    public static final int DEPTHSTENCILSWIZZLEONESUPPORT = 0;
    public static final int POLYGONMODEPOINTSIZE = 0;
    public static final int NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM = 0;
    public static final int NONSTRICTWIDELINESUSEPARALLELOGRAM = 0;
    public static final int BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = 0;
    public static final int MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = 0;
    public static final int FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = 0;
    public static final int DEFAULTROBUSTNESSSTORAGEBUFFERS = 0;
    public static final int DEFAULTROBUSTNESSUNIFORMBUFFERS = 0;
    public static final int DEFAULTROBUSTNESSVERTEXINPUTS = 0;
    public static final int DEFAULTROBUSTNESSIMAGES = 0;
    public static final int COPYSRCLAYOUTCOUNT = 0;
    public static final int PCOPYSRCLAYOUTS = 0;
    public static final int COPYDSTLAYOUTCOUNT = 0;
    public static final int PCOPYDSTLAYOUTS = 0;
    public static final int OPTIMALTILINGLAYOUTUUID = 0;
    public static final int IDENTICALMEMORYTYPEREQUIREMENTS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan14Properties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties, org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int lineSubPixelPrecisionBits() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nlineSubPixelPrecisionBits(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxVertexAttribDivisor() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nmaxVertexAttribDivisor(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean supportsNonZeroFirstInstance() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nsupportsNonZeroFirstInstance(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPushDescriptors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nmaxPushDescriptors(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean dynamicRenderingLocalReadDepthStencilAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndynamicRenderingLocalReadDepthStencilAttachments(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean dynamicRenderingLocalReadMultisampledAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndynamicRenderingLocalReadMultisampledAttachments(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nearlyFragmentMultisampleCoverageAfterSampleCounting(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nearlyFragmentSampleMaskTestBeforeSampleCounting(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean depthStencilSwizzleOneSupport() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndepthStencilSwizzleOneSupport(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean polygonModePointSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.npolygonModePointSize(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean nonStrictSinglePixelWideLinesUseParallelogram() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nnonStrictSinglePixelWideLinesUseParallelogram(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean nonStrictWideLinesUseParallelogram() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nnonStrictWideLinesUseParallelogram(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean blockTexelViewCompatibleMultipleLayers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nblockTexelViewCompatibleMultipleLayers(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxCombinedImageSamplerDescriptorCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nmaxCombinedImageSamplerDescriptorCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateClampCombinerInputs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nfragmentShadingRateClampCombinerInputs(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessStorageBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessStorageBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessUniformBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessUniformBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineRobustnessBufferBehavior")
        public int defaultRobustnessVertexInputs() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessVertexInputs(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineRobustnessImageBehavior")
        public int defaultRobustnessImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ndefaultRobustnessImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int copySrcLayoutCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ncopySrcLayoutCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout *")
        public java.nio.IntBuffer pCopySrcLayouts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.npCopySrcLayouts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int copyDstLayoutCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ncopyDstLayoutCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout *")
        public java.nio.IntBuffer pCopyDstLayouts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.npCopyDstLayouts(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]")
        public java.nio.ByteBuffer optimalTilingLayoutUUID() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.noptimalTilingLayoutUUID(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint8_t")
        public byte optimalTilingLayoutUUID(int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                byte r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.noptimalTilingLayoutUUID(r0, r1)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean identicalMemoryTypeRequirements() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nidenticalMemoryTypeRequirements(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 56
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m6213create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceVulkan14Properties(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceVulkan14Properties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int lineSubPixelPrecisionBits() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlineSubPixelPrecisionBits(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxVertexAttribDivisor() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxVertexAttribDivisor(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean supportsNonZeroFirstInstance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsupportsNonZeroFirstInstance(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPushDescriptors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPushDescriptors(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean dynamicRenderingLocalReadDepthStencilAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndynamicRenderingLocalReadDepthStencilAttachments(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean dynamicRenderingLocalReadMultisampledAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndynamicRenderingLocalReadMultisampledAttachments(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean earlyFragmentMultisampleCoverageAfterSampleCounting() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nearlyFragmentMultisampleCoverageAfterSampleCounting(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean earlyFragmentSampleMaskTestBeforeSampleCounting() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nearlyFragmentSampleMaskTestBeforeSampleCounting(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean depthStencilSwizzleOneSupport() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndepthStencilSwizzleOneSupport(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean polygonModePointSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npolygonModePointSize(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean nonStrictSinglePixelWideLinesUseParallelogram() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnonStrictSinglePixelWideLinesUseParallelogram(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean nonStrictWideLinesUseParallelogram() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nnonStrictWideLinesUseParallelogram(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean blockTexelViewCompatibleMultipleLayers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nblockTexelViewCompatibleMultipleLayers(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxCombinedImageSamplerDescriptorCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxCombinedImageSamplerDescriptorCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateClampCombinerInputs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateClampCombinerInputs(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessStorageBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndefaultRobustnessStorageBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessUniformBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndefaultRobustnessUniformBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineRobustnessBufferBehavior")
    public int defaultRobustnessVertexInputs() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndefaultRobustnessVertexInputs(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPipelineRobustnessImageBehavior")
    public int defaultRobustnessImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndefaultRobustnessImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int copySrcLayoutCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncopySrcLayoutCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout *")
    public java.nio.IntBuffer pCopySrcLayouts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npCopySrcLayouts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int copyDstLayoutCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncopyDstLayoutCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout *")
    public java.nio.IntBuffer pCopyDstLayouts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npCopyDstLayouts(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t[VK_UUID_SIZE]")
    public java.nio.ByteBuffer optimalTilingLayoutUUID() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = noptimalTilingLayoutUUID(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint8_t")
    public byte optimalTilingLayoutUUID(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            byte r0 = noptimalTilingLayoutUUID(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean identicalMemoryTypeRequirements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nidenticalMemoryTypeRequirements(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 56
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties set(org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nlineSubPixelPrecisionBits(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.LINESUBPIXELPRECISIONBITS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxVertexAttribDivisor(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXVERTEXATTRIBDIVISOR
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsupportsNonZeroFirstInstance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SUPPORTSNONZEROFIRSTINSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxPushDescriptors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXPUSHDESCRIPTORS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndynamicRenderingLocalReadDepthStencilAttachments(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndynamicRenderingLocalReadMultisampledAttachments(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nearlyFragmentMultisampleCoverageAfterSampleCounting(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nearlyFragmentSampleMaskTestBeforeSampleCounting(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndepthStencilSwizzleOneSupport(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEPTHSTENCILSWIZZLEONESUPPORT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int npolygonModePointSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.POLYGONMODEPOINTSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnonStrictSinglePixelWideLinesUseParallelogram(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nnonStrictWideLinesUseParallelogram(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.NONSTRICTWIDELINESUSEPARALLELOGRAM
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nblockTexelViewCompatibleMultipleLayers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nmaxCombinedImageSamplerDescriptorCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nfragmentShadingRateClampCombinerInputs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndefaultRobustnessStorageBuffers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSSTORAGEBUFFERS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndefaultRobustnessUniformBuffers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSUNIFORMBUFFERS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndefaultRobustnessVertexInputs(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSVERTEXINPUTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndefaultRobustnessImages(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSIMAGES
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ncopySrcLayoutCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.COPYSRCLAYOUTCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.IntBuffer npCopySrcLayouts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PCOPYSRCLAYOUTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncopySrcLayoutCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int ncopyDstLayoutCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.COPYDSTLAYOUTCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.IntBuffer npCopyDstLayouts(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PCOPYDSTLAYOUTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncopyDstLayoutCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static java.nio.ByteBuffer noptimalTilingLayoutUUID(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.OPTIMALTILINGLAYOUTUUID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = 16
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static byte noptimalTilingLayoutUUID(long r7, int r9) {
            r0 = r7
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.OPTIMALTILINGLAYOUTUUID
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r9
            r2 = 16
            long r1 = org.lwjgl.system.Checks.check(r1, r2)
            r2 = 1
            long r1 = r1 * r2
            long r0 = r0 + r1
            byte r0 = org.lwjgl.system.MemoryUtil.memGetByte(r0)
            return r0
    }

    public static int nidenticalMemoryTypeRequirements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.IDENTICALMEMORYTYPEREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 27
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.POINTER_SIZE
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
            r1 = r0
            r2 = 12
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            r3 = 1
            r4 = 16
            org.lwjgl.system.Struct$Member r3 = __array(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.LINESUBPIXELPRECISIONBITS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXVERTEXATTRIBDIVISOR = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.SUPPORTSNONZEROFIRSTINSTANCE = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXPUSHDESCRIPTORS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADDEPTHSTENCILATTACHMENTS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DYNAMICRENDERINGLOCALREADMULTISAMPLEDATTACHMENTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTMULTISAMPLECOVERAGEAFTERSAMPLECOUNTING = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.EARLYFRAGMENTSAMPLEMASKTESTBEFORESAMPLECOUNTING = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEPTHSTENCILSWIZZLEONESUPPORT = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.POLYGONMODEPOINTSIZE = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.NONSTRICTSINGLEPIXELWIDELINESUSEPARALLELOGRAM = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.NONSTRICTWIDELINESUSEPARALLELOGRAM = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.BLOCKTEXELVIEWCOMPATIBLEMULTIPLELAYERS = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.MAXCOMBINEDIMAGESAMPLERDESCRIPTORCOUNT = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.FRAGMENTSHADINGRATECLAMPCOMBINERINPUTS = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSSTORAGEBUFFERS = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSUNIFORMBUFFERS = r0
            r0 = r6
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSVERTEXINPUTS = r0
            r0 = r6
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.DEFAULTROBUSTNESSIMAGES = r0
            r0 = r6
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.COPYSRCLAYOUTCOUNT = r0
            r0 = r6
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PCOPYSRCLAYOUTS = r0
            r0 = r6
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.COPYDSTLAYOUTCOUNT = r0
            r0 = r6
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.PCOPYDSTLAYOUTS = r0
            r0 = r6
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.OPTIMALTILINGLAYOUTUUID = r0
            r0 = r6
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan14Properties.IDENTICALMEMORYTYPEREQUIREMENTS = r0
            return
    }
}
