package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapPropertiesEXT.class */
public class VkPhysicalDeviceDescriptorHeapPropertiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SAMPLERHEAPALIGNMENT = 0;
    public static final int RESOURCEHEAPALIGNMENT = 0;
    public static final int MAXSAMPLERHEAPSIZE = 0;
    public static final int MAXRESOURCEHEAPSIZE = 0;
    public static final int MINSAMPLERHEAPRESERVEDRANGE = 0;
    public static final int MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED = 0;
    public static final int MINRESOURCEHEAPRESERVEDRANGE = 0;
    public static final int SAMPLERDESCRIPTORSIZE = 0;
    public static final int IMAGEDESCRIPTORSIZE = 0;
    public static final int BUFFERDESCRIPTORSIZE = 0;
    public static final int SAMPLERDESCRIPTORALIGNMENT = 0;
    public static final int IMAGEDESCRIPTORALIGNMENT = 0;
    public static final int BUFFERDESCRIPTORALIGNMENT = 0;
    public static final int MAXPUSHDATASIZE = 0;
    public static final int IMAGECAPTUREREPLAYOPAQUEDATASIZE = 0;
    public static final int MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS = 0;
    public static final int SAMPLERYCBCRCONVERSIONCOUNT = 0;
    public static final int SPARSEDESCRIPTORHEAPS = 0;
    public static final int PROTECTEDDESCRIPTORHEAPS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long samplerHeapAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerHeapAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long resourceHeapAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nresourceHeapAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long maxSamplerHeapSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxSamplerHeapSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long maxResourceHeapSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxResourceHeapSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long minSamplerHeapReservedRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminSamplerHeapReservedRange(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long minSamplerHeapReservedRangeWithEmbedded() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminSamplerHeapReservedRangeWithEmbedded(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long minResourceHeapReservedRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nminResourceHeapReservedRange(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long samplerDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long imageDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long bufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nbufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long samplerDescriptorAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerDescriptorAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long imageDescriptorAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageDescriptorAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long bufferDescriptorAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nbufferDescriptorAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long maxPushDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxPushDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long imageCaptureReplayOpaqueDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nimageCaptureReplayOpaqueDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorHeapEmbeddedSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nmaxDescriptorHeapEmbeddedSamplers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int samplerYcbcrConversionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsamplerYcbcrConversionCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean sparseDescriptorHeaps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsparseDescriptorHeaps(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean protectedDescriptorHeaps() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nprotectedDescriptorHeaps(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000135008(0x3b9cd960, float:0.0047866553)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m5349create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDescriptorHeapPropertiesEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDescriptorHeapPropertiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long samplerHeapAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplerHeapAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long resourceHeapAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nresourceHeapAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long maxSamplerHeapSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxSamplerHeapSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long maxResourceHeapSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxResourceHeapSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long minSamplerHeapReservedRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminSamplerHeapReservedRange(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long minSamplerHeapReservedRangeWithEmbedded() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminSamplerHeapReservedRangeWithEmbedded(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long minResourceHeapReservedRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminResourceHeapReservedRange(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long samplerDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplerDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long imageDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimageDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long bufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long samplerDescriptorAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplerDescriptorAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long imageDescriptorAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimageDescriptorAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long bufferDescriptorAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbufferDescriptorAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long maxPushDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxPushDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long imageCaptureReplayOpaqueDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimageCaptureReplayOpaqueDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorHeapEmbeddedSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorHeapEmbeddedSamplers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int samplerYcbcrConversionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerYcbcrConversionCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean sparseDescriptorHeaps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsparseDescriptorHeaps(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean protectedDescriptorHeaps() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nprotectedDescriptorHeaps(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000135008(0x3b9cd960, float:0.0047866553)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsamplerHeapAlignment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERHEAPALIGNMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nresourceHeapAlignment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.RESOURCEHEAPALIGNMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nmaxSamplerHeapSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXSAMPLERHEAPSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nmaxResourceHeapSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXRESOURCEHEAPSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nminSamplerHeapReservedRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINSAMPLERHEAPRESERVEDRANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nminSamplerHeapReservedRangeWithEmbedded(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nminResourceHeapReservedRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINRESOURCEHEAPRESERVEDRANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nsamplerDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nimageDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGEDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nbufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.BUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nsamplerDescriptorAlignment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERDESCRIPTORALIGNMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nimageDescriptorAlignment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGEDESCRIPTORALIGNMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nbufferDescriptorAlignment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.BUFFERDESCRIPTORALIGNMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nmaxPushDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXPUSHDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long nimageCaptureReplayOpaqueDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGECAPTUREREPLAYOPAQUEDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxDescriptorHeapEmbeddedSamplers(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsamplerYcbcrConversionCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERYCBCRCONVERSIONCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsparseDescriptorHeaps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SPARSEDESCRIPTORHEAPS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nprotectedDescriptorHeaps(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.PROTECTEDDESCRIPTORHEAPS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 21
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERHEAPALIGNMENT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.RESOURCEHEAPALIGNMENT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXSAMPLERHEAPSIZE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXRESOURCEHEAPSIZE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINSAMPLERHEAPRESERVEDRANGE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINSAMPLERHEAPRESERVEDRANGEWITHEMBEDDED = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MINRESOURCEHEAPRESERVEDRANGE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGEDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.BUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERDESCRIPTORALIGNMENT = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGEDESCRIPTORALIGNMENT = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.BUFFERDESCRIPTORALIGNMENT = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXPUSHDATASIZE = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.IMAGECAPTUREREPLAYOPAQUEDATASIZE = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.MAXDESCRIPTORHEAPEMBEDDEDSAMPLERS = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SAMPLERYCBCRCONVERSIONCOUNT = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.SPARSEDESCRIPTORHEAPS = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorHeapPropertiesEXT.PROTECTEDDESCRIPTORHEAPS = r0
            return
    }
}
