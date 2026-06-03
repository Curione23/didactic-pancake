package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR.class */
public class VkPhysicalDeviceFragmentShadingRatePropertiesKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = 0;
    public static final int MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = 0;
    public static final int MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO = 0;
    public static final int PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS = 0;
    public static final int LAYEREDSHADINGRATEATTACHMENTS = 0;
    public static final int FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS = 0;
    public static final int MAXFRAGMENTSIZE = 0;
    public static final int MAXFRAGMENTSIZEASPECTRATIO = 0;
    public static final int MAXFRAGMENTSHADINGRATECOVERAGESAMPLES = 0;
    public static final int MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES = 0;
    public static final int FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES = 0;
    public static final int FRAGMENTSHADINGRATEWITHSAMPLEMASK = 0;
    public static final int FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK = 0;
    public static final int FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION = 0;
    public static final int FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK = 0;
    public static final int FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS = 0;
    public static final int FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR, org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nminFragmentShadingRateAttachmentTexelSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean primitiveFragmentShadingRateWithMultipleViewports() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nprimitiveFragmentShadingRateWithMultipleViewports(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean layeredShadingRateAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nlayeredShadingRateAttachments(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateNonTrivialCombinerOps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateNonTrivialCombinerOps(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D maxFragmentSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxFragmentSizeAspectRatio() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentSizeAspectRatio(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxFragmentShadingRateCoverageSamples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateCoverageSamples(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSampleCountFlagBits")
        public int maxFragmentShadingRateRasterizationSamples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nmaxFragmentShadingRateRasterizationSamples(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderDepthStencilWrites() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderDepthStencilWrites(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateWithSampleMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithSampleMask(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateWithShaderSampleMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithShaderSampleMask(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateWithConservativeRasterization() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithConservativeRasterization(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateWithFragmentShaderInterlock() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithFragmentShaderInterlock(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateWithCustomSampleLocations() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateWithCustomSampleLocations(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean fragmentShadingRateStrictMultiplyCombiner() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nfragmentShadingRateStrictMultiplyCombiner(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000226002(0x3b9e3cd2, float:0.0048290277)
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceFragmentShadingRatePropertiesKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceFragmentShadingRatePropertiesKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
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

    public org.lwjgl.vulkan.VkExtent2D minFragmentShadingRateAttachmentTexelSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nminFragmentShadingRateAttachmentTexelSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxFragmentShadingRateAttachmentTexelSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxFragmentShadingRateAttachmentTexelSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxFragmentShadingRateAttachmentTexelSizeAspectRatio() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean primitiveFragmentShadingRateWithMultipleViewports() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprimitiveFragmentShadingRateWithMultipleViewports(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean layeredShadingRateAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlayeredShadingRateAttachments(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateNonTrivialCombinerOps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateNonTrivialCombinerOps(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D maxFragmentSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nmaxFragmentSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxFragmentSizeAspectRatio() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxFragmentSizeAspectRatio(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxFragmentShadingRateCoverageSamples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxFragmentShadingRateCoverageSamples(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSampleCountFlagBits")
    public int maxFragmentShadingRateRasterizationSamples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxFragmentShadingRateRasterizationSamples(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderDepthStencilWrites() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateWithShaderDepthStencilWrites(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateWithSampleMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateWithSampleMask(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateWithShaderSampleMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateWithShaderSampleMask(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateWithConservativeRasterization() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateWithConservativeRasterization(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateWithFragmentShaderInterlock() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateWithFragmentShaderInterlock(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateWithCustomSampleLocations() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateWithCustomSampleLocations(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean fragmentShadingRateStrictMultiplyCombiner() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nfragmentShadingRateStrictMultiplyCombiner(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000226002(0x3b9e3cd2, float:0.0048290277)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR set(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nminFragmentShadingRateAttachmentTexelSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxFragmentShadingRateAttachmentTexelSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nmaxFragmentShadingRateAttachmentTexelSizeAspectRatio(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nprimitiveFragmentShadingRateWithMultipleViewports(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nlayeredShadingRateAttachments(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.LAYEREDSHADINGRATEATTACHMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateNonTrivialCombinerOps(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nmaxFragmentSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nmaxFragmentSizeAspectRatio(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZEASPECTRATIO
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxFragmentShadingRateCoverageSamples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATECOVERAGESAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxFragmentShadingRateRasterizationSamples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateWithShaderDepthStencilWrites(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateWithSampleMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSAMPLEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateWithShaderSampleMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateWithConservativeRasterization(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateWithFragmentShaderInterlock(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateWithCustomSampleLocations(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nfragmentShadingRateStrictMultiplyCombiner(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 19
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MINFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATEATTACHMENTTEXELSIZEASPECTRATIO = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.PRIMITIVEFRAGMENTSHADINGRATEWITHMULTIPLEVIEWPORTS = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.LAYEREDSHADINGRATEATTACHMENTS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATENONTRIVIALCOMBINEROPS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZE = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSIZEASPECTRATIO = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATECOVERAGESAMPLES = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.MAXFRAGMENTSHADINGRATERASTERIZATIONSAMPLES = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERDEPTHSTENCILWRITES = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSAMPLEMASK = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHSHADERSAMPLEMASK = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCONSERVATIVERASTERIZATION = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHFRAGMENTSHADERINTERLOCK = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATEWITHCUSTOMSAMPLELOCATIONS = r0
            r0 = r6
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR.FRAGMENTSHADINGRATESTRICTMULTIPLYCOMBINER = r0
            return
    }
}
