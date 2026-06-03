package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties.class */
public class VkPhysicalDeviceDescriptorIndexingProperties extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = 0;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = 0;
    public static final int ROBUSTBUFFERACCESSUPDATEAFTERBIND = 0;
    public static final int QUADDIVERGENTIMPLICITLOD = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = 0;
    public static final int MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = 0;
    public static final int MAXPERSTAGEUPDATEAFTERBINDRESOURCES = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = 0;
    public static final int MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingProperties$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxUpdateAfterBindDescriptorsInAllPools() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxUpdateAfterBindDescriptorsInAllPools(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nshaderUniformBufferArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nshaderSampledImageArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nshaderStorageBufferArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nshaderStorageImageArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nshaderInputAttachmentArrayNonUniformIndexingNative(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean robustBufferAccessUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nrobustBufferAccessUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean quadDivergentImplicitLod() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nquadDivergentImplicitLod(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindSamplers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindSampledImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindStorageImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageDescriptorUpdateAfterBindInputAttachments(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxPerStageUpdateAfterBindResources() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxPerStageUpdateAfterBindResources(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSamplers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindSamplers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindUniformBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageBuffers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindSampledImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindSampledImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindStorageImages() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindStorageImages(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int maxDescriptorSetUpdateAfterBindInputAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nmaxDescriptorSetUpdateAfterBindInputAttachments(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000161002(0x3b9d3eea, float:0.0047987597)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDescriptorIndexingProperties(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDescriptorIndexingProperties(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
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
    public int maxUpdateAfterBindDescriptorsInAllPools() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxUpdateAfterBindDescriptorsInAllPools(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderUniformBufferArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSampledImageArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageBufferArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageImageArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexingNative() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderInputAttachmentArrayNonUniformIndexingNative(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean robustBufferAccessUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nrobustBufferAccessUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean quadDivergentImplicitLod() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nquadDivergentImplicitLod(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindSamplers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindUniformBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindSampledImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindSampledImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindStorageImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindStorageImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageDescriptorUpdateAfterBindInputAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageDescriptorUpdateAfterBindInputAttachments(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxPerStageUpdateAfterBindResources() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxPerStageUpdateAfterBindResources(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSamplers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindSamplers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindUniformBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindUniformBuffersDynamic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageBuffers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageBuffersDynamic() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindSampledImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindSampledImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindStorageImages() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindStorageImages(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int maxDescriptorSetUpdateAfterBindInputAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmaxDescriptorSetUpdateAfterBindInputAttachments(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000161002(0x3b9d3eea, float:0.0047987597)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties set(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nmaxUpdateAfterBindDescriptorsInAllPools(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformBufferArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSampledImageArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageBufferArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageImageArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexingNative(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nrobustBufferAccessUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ROBUSTBUFFERACCESSUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nquadDivergentImplicitLod(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.QUADDIVERGENTIMPLICITLOD
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSamplers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindUniformBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindSampledImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindStorageImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageDescriptorUpdateAfterBindInputAttachments(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxPerStageUpdateAfterBindResources(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindSamplers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindUniformBuffersDynamic(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageBuffersDynamic(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindSampledImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindStorageImages(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nmaxDescriptorSetUpdateAfterBindInputAttachments(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 25
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXUPDATEAFTERBINDDESCRIPTORSINALLPOOLS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXINGNATIVE = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.ROBUSTBUFFERACCESSUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.QUADDIVERGENTIMPLICITLOD = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLERS = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDUNIFORMBUFFERS = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEBUFFERS = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSAMPLEDIMAGES = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDSTORAGEIMAGES = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEDESCRIPTORUPDATEAFTERBINDINPUTATTACHMENTS = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXPERSTAGEUPDATEAFTERBINDRESOURCES = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLERS = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERS = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDUNIFORMBUFFERSDYNAMIC = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERS = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEBUFFERSDYNAMIC = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSAMPLEDIMAGES = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDSTORAGEIMAGES = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties.MAXDESCRIPTORSETUPDATEAFTERBINDINPUTATTACHMENTS = r0
            return
    }
}
