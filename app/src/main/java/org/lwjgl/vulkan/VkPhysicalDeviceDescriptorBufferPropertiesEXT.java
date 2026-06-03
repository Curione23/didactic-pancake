package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT.class */
public class VkPhysicalDeviceDescriptorBufferPropertiesEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY = 0;
    public static final int BUFFERLESSPUSHDESCRIPTORS = 0;
    public static final int ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION = 0;
    public static final int DESCRIPTORBUFFEROFFSETALIGNMENT = 0;
    public static final int MAXDESCRIPTORBUFFERBINDINGS = 0;
    public static final int MAXRESOURCEDESCRIPTORBUFFERBINDINGS = 0;
    public static final int MAXSAMPLERDESCRIPTORBUFFERBINDINGS = 0;
    public static final int MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS = 0;
    public static final int MAXEMBEDDEDIMMUTABLESAMPLERS = 0;
    public static final int BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int IMAGECAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int SAMPLERDESCRIPTORSIZE = 0;
    public static final int COMBINEDIMAGESAMPLERDESCRIPTORSIZE = 0;
    public static final int SAMPLEDIMAGEDESCRIPTORSIZE = 0;
    public static final int STORAGEIMAGEDESCRIPTORSIZE = 0;
    public static final int UNIFORMTEXELBUFFERDESCRIPTORSIZE = 0;
    public static final int ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE = 0;
    public static final int STORAGETEXELBUFFERDESCRIPTORSIZE = 0;
    public static final int ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE = 0;
    public static final int UNIFORMBUFFERDESCRIPTORSIZE = 0;
    public static final int ROBUSTUNIFORMBUFFERDESCRIPTORSIZE = 0;
    public static final int STORAGEBUFFERDESCRIPTORSIZE = 0;
    public static final int ROBUSTSTORAGEBUFFERDESCRIPTORSIZE = 0;
    public static final int INPUTATTACHMENTDESCRIPTORSIZE = 0;
    public static final int ACCELERATIONSTRUCTUREDESCRIPTORSIZE = 0;
    public static final int MAXSAMPLERDESCRIPTORBUFFERRANGE = 0;
    public static final int MAXRESOURCEDESCRIPTORBUFFERRANGE = 0;
    public static final int SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE = 0;
    public static final int RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE = 0;
    public static final int DESCRIPTORBUFFERADDRESSSPACESIZE = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean combinedImageSamplerDescriptorSingleArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSingleArray(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean bufferlessPushDescriptors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferlessPushDescriptors(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean allowSamplerImageViewPostSubmitCreation() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nallowSamplerImageViewPostSubmitCreation(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long descriptorBufferOffsetAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferOffsetAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorBufferBindings() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxDescriptorBufferBindings(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxResourceDescriptorBufferBindings() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferBindings(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxSamplerDescriptorBufferBindings() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferBindings(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplerBindings() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplerBindings(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxEmbeddedImmutableSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxEmbeddedImmutableSamplers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long bufferCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nbufferCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long imageCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long imageViewCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nimageViewCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long samplerCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long accelerationStructureCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long samplerDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long combinedImageSamplerDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ncombinedImageSamplerDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long sampledImageDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsampledImageDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long storageImageDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageImageDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long uniformTexelBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformTexelBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long robustUniformTexelBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformTexelBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long storageTexelBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageTexelBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long robustStorageTexelBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageTexelBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long uniformBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nuniformBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long robustUniformBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustUniformBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long storageBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nstorageBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long robustStorageBufferDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nrobustStorageBufferDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long inputAttachmentDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ninputAttachmentDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long accelerationStructureDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.naccelerationStructureDescriptorSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long maxSamplerDescriptorBufferRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxSamplerDescriptorBufferRange(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long maxResourceDescriptorBufferRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nmaxResourceDescriptorBufferRange(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long samplerDescriptorBufferAddressSpaceSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsamplerDescriptorBufferAddressSpaceSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long resourceDescriptorBufferAddressSpaceSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nresourceDescriptorBufferAddressSpaceSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long descriptorBufferAddressSpaceSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ndescriptorBufferAddressSpaceSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000316000(0x3b9f9c60, float:0.0048709363)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDescriptorBufferPropertiesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDescriptorBufferPropertiesEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
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

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean combinedImageSamplerDescriptorSingleArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncombinedImageSamplerDescriptorSingleArray(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean bufferlessPushDescriptors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferlessPushDescriptors(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean allowSamplerImageViewPostSubmitCreation() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nallowSamplerImageViewPostSubmitCreation(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long descriptorBufferOffsetAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndescriptorBufferOffsetAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorBufferBindings() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorBufferBindings(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxResourceDescriptorBufferBindings() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxResourceDescriptorBufferBindings(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxSamplerDescriptorBufferBindings() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxSamplerDescriptorBufferBindings(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplerBindings() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxEmbeddedImmutableSamplerBindings(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxEmbeddedImmutableSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxEmbeddedImmutableSamplers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long bufferCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbufferCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long imageCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimageCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long imageViewCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nimageViewCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long samplerCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplerCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long accelerationStructureCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naccelerationStructureCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long samplerDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplerDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long combinedImageSamplerDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncombinedImageSamplerDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long sampledImageDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsampledImageDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long storageImageDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstorageImageDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long uniformTexelBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuniformTexelBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long robustUniformTexelBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrobustUniformTexelBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long storageTexelBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstorageTexelBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long robustStorageTexelBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrobustStorageTexelBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long uniformBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nuniformBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long robustUniformBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrobustUniformBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long storageBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nstorageBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long robustStorageBufferDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrobustStorageBufferDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long inputAttachmentDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ninputAttachmentDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long accelerationStructureDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = naccelerationStructureDescriptorSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long maxSamplerDescriptorBufferRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxSamplerDescriptorBufferRange(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long maxResourceDescriptorBufferRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxResourceDescriptorBufferRange(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long samplerDescriptorBufferAddressSpaceSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsamplerDescriptorBufferAddressSpaceSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long resourceDescriptorBufferAddressSpaceSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nresourceDescriptorBufferAddressSpaceSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long descriptorBufferAddressSpaceSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndescriptorBufferAddressSpaceSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000316000(0x3b9f9c60, float:0.0048709363)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int ncombinedImageSamplerDescriptorSingleArray(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbufferlessPushDescriptors(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERLESSPUSHDESCRIPTORS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nallowSamplerImageViewPostSubmitCreation(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long ndescriptorBufferOffsetAlignment(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFEROFFSETALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nmaxDescriptorBufferBindings(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXDESCRIPTORBUFFERBINDINGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxResourceDescriptorBufferBindings(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERBINDINGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxSamplerDescriptorBufferBindings(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERBINDINGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxEmbeddedImmutableSamplerBindings(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxEmbeddedImmutableSamplers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nbufferCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nimageCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.IMAGECAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nimageViewCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsamplerCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long naccelerationStructureCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsamplerDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ncombinedImageSamplerDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nsampledImageDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLEDIMAGEDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nstorageImageDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGEIMAGEDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nuniformTexelBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNIFORMTEXELBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nrobustUniformTexelBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nstorageTexelBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGETEXELBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nrobustStorageTexelBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nuniformBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNIFORMBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nrobustUniformBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTUNIFORMBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nstorageBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGEBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nrobustStorageBufferDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTSTORAGEBUFFERDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ninputAttachmentDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.INPUTATTACHMENTDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long naccelerationStructureDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ACCELERATIONSTRUCTUREDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nmaxSamplerDescriptorBufferRange(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERRANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nmaxResourceDescriptorBufferRange(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERRANGE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nsamplerDescriptorBufferAddressSpaceSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nresourceDescriptorBufferAddressSpaceSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long ndescriptorBufferAddressSpaceSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFERADDRESSSPACESIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 35
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
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
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSINGLEARRAY = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERLESSPUSHDESCRIPTORS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ALLOWSAMPLERIMAGEVIEWPOSTSUBMITCREATION = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFEROFFSETALIGNMENT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXDESCRIPTORBUFFERBINDINGS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERBINDINGS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERBINDINGS = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERBINDINGS = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXEMBEDDEDIMMUTABLESAMPLERS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.BUFFERCAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.IMAGECAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.IMAGEVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERCAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ACCELERATIONSTRUCTURECAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.COMBINEDIMAGESAMPLERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLEDIMAGEDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGEIMAGEDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNIFORMTEXELBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTUNIFORMTEXELBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGETEXELBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTSTORAGETEXELBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.UNIFORMBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTUNIFORMBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.STORAGEBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ROBUSTSTORAGEBUFFERDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.INPUTATTACHMENTDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.ACCELERATIONSTRUCTUREDESCRIPTORSIZE = r0
            r0 = r5
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXSAMPLERDESCRIPTORBUFFERRANGE = r0
            r0 = r5
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.MAXRESOURCEDESCRIPTORBUFFERRANGE = r0
            r0 = r5
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.SAMPLERDESCRIPTORBUFFERADDRESSSPACESIZE = r0
            r0 = r5
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.RESOURCEDESCRIPTORBUFFERADDRESSSPACESIZE = r0
            r0 = r5
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT.DESCRIPTORBUFFERADDRESSSPACESIZE = r0
            return
    }
}
