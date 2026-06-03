package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features.class */
public class VkPhysicalDeviceVulkan12Features extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SAMPLERMIRRORCLAMPTOEDGE = 0;
    public static final int DRAWINDIRECTCOUNT = 0;
    public static final int STORAGEBUFFER8BITACCESS = 0;
    public static final int UNIFORMANDSTORAGEBUFFER8BITACCESS = 0;
    public static final int STORAGEPUSHCONSTANT8 = 0;
    public static final int SHADERBUFFERINT64ATOMICS = 0;
    public static final int SHADERSHAREDINT64ATOMICS = 0;
    public static final int SHADERFLOAT16 = 0;
    public static final int SHADERINT8 = 0;
    public static final int DESCRIPTORINDEXING = 0;
    public static final int SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = 0;
    public static final int SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = 0;
    public static final int SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = 0;
    public static final int SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = 0;
    public static final int SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = 0;
    public static final int SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = 0;
    public static final int SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = 0;
    public static final int SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = 0;
    public static final int SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = 0;
    public static final int SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = 0;
    public static final int DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = 0;
    public static final int DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = 0;
    public static final int DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = 0;
    public static final int DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = 0;
    public static final int DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = 0;
    public static final int DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = 0;
    public static final int DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = 0;
    public static final int DESCRIPTORBINDINGPARTIALLYBOUND = 0;
    public static final int DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = 0;
    public static final int RUNTIMEDESCRIPTORARRAY = 0;
    public static final int SAMPLERFILTERMINMAX = 0;
    public static final int SCALARBLOCKLAYOUT = 0;
    public static final int IMAGELESSFRAMEBUFFER = 0;
    public static final int UNIFORMBUFFERSTANDARDLAYOUT = 0;
    public static final int SHADERSUBGROUPEXTENDEDTYPES = 0;
    public static final int SEPARATEDEPTHSTENCILLAYOUTS = 0;
    public static final int HOSTQUERYRESET = 0;
    public static final int TIMELINESEMAPHORE = 0;
    public static final int BUFFERDEVICEADDRESS = 0;
    public static final int BUFFERDEVICEADDRESSCAPTUREREPLAY = 0;
    public static final int BUFFERDEVICEADDRESSMULTIDEVICE = 0;
    public static final int VULKANMEMORYMODEL = 0;
    public static final int VULKANMEMORYMODELDEVICESCOPE = 0;
    public static final int VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = 0;
    public static final int SHADEROUTPUTVIEWPORTINDEX = 0;
    public static final int SHADEROUTPUTLAYER = 0;
    public static final int SUBGROUPBROADCASTDYNAMICID = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceVulkan12Features$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features, org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean samplerMirrorClampToEdge() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean drawIndirectCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean storageBuffer8BitAccess() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean uniformAndStorageBuffer8BitAccess() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean storagePushConstant8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderBufferInt64Atomics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSharedInt64Atomics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderFloat16() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderFloat16(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderInt8() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderInt8(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayDynamicIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayDynamicIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderUniformBufferArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSampledImageArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageBufferArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageImageArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderUniformTexelBufferArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderStorageTexelBufferArrayNonUniformIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingUniformBufferUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingSampledImageUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingStorageImageUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingStorageBufferUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingUpdateUnusedWhilePending() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingPartiallyBound() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean descriptorBindingVariableDescriptorCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean runtimeDescriptorArray() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean samplerFilterMinmax() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean scalarBlockLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean imagelessFramebuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean uniformBufferStandardLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderSubgroupExtendedTypes() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean separateDepthStencilLayouts() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean hostQueryReset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nhostQueryReset(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean timelineSemaphore() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean bufferDeviceAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean bufferDeviceAddressCaptureReplay() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean bufferDeviceAddressMultiDevice() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vulkanMemoryModel() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vulkanMemoryModelDeviceScope() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean vulkanMemoryModelAvailabilityVisibilityChains() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderOutputViewportIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderOutputLayer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean subgroupBroadcastDynamicId() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 51
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer samplerMirrorClampToEdge(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsamplerMirrorClampToEdge(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer drawIndirectCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndrawIndirectCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer storageBuffer8BitAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nstorageBuffer8BitAccess(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer uniformAndStorageBuffer8BitAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nuniformAndStorageBuffer8BitAccess(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer storagePushConstant8(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nstoragePushConstant8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderBufferInt64Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderBufferInt64Atomics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderSharedInt64Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderSharedInt64Atomics(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderFloat16(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderFloat16(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderInt8(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderInt8(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderUniformBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderSampledImageArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageImageArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderInputAttachmentArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderUniformTexelBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderStorageTexelBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingSampledImageUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageImageUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingUpdateUnusedWhilePending(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingPartiallyBound(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ndescriptorBindingVariableDescriptorCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nruntimeDescriptorArray(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer samplerFilterMinmax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsamplerFilterMinmax(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer scalarBlockLayout(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nscalarBlockLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer imagelessFramebuffer(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nimagelessFramebuffer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer uniformBufferStandardLayout(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nuniformBufferStandardLayout(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderSubgroupExtendedTypes(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderSubgroupExtendedTypes(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer separateDepthStencilLayouts(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nseparateDepthStencilLayouts(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer hostQueryReset(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nhostQueryReset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer timelineSemaphore(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ntimelineSemaphore(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddress(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nbufferDeviceAddress(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddressCaptureReplay(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressCaptureReplay(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer bufferDeviceAddressMultiDevice(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nbufferDeviceAddressMultiDevice(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModel(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nvulkanMemoryModel(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModelDeviceScope(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelDeviceScope(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer vulkanMemoryModelAvailabilityVisibilityChains(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nvulkanMemoryModelAvailabilityVisibilityChains(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderOutputViewportIndex(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderOutputViewportIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer shaderOutputLayer(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nshaderOutputLayer(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer subgroupBroadcastDynamicId(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.nsubgroupBroadcastDynamicId(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceVulkan12Features(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceVulkan12Features(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
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
    public boolean samplerMirrorClampToEdge() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerMirrorClampToEdge(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean drawIndirectCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndrawIndirectCount(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean storageBuffer8BitAccess() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstorageBuffer8BitAccess(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean uniformAndStorageBuffer8BitAccess() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuniformAndStorageBuffer8BitAccess(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean storagePushConstant8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstoragePushConstant8(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderBufferInt64Atomics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderBufferInt64Atomics(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSharedInt64Atomics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSharedInt64Atomics(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderFloat16() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderFloat16(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderInt8() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderInt8(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayDynamicIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderInputAttachmentArrayDynamicIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayDynamicIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderUniformTexelBufferArrayDynamicIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayDynamicIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageTexelBufferArrayDynamicIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderUniformBufferArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderUniformBufferArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSampledImageArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSampledImageArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageBufferArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageBufferArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageImageArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageImageArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderInputAttachmentArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderInputAttachmentArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderUniformTexelBufferArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderUniformTexelBufferArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderStorageTexelBufferArrayNonUniformIndexing() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderStorageTexelBufferArrayNonUniformIndexing(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingUniformBufferUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingUniformBufferUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingSampledImageUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingSampledImageUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingStorageImageUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingStorageImageUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingStorageBufferUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingStorageBufferUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingUniformTexelBufferUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingStorageTexelBufferUpdateAfterBind() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingUpdateUnusedWhilePending() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingUpdateUnusedWhilePending(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingPartiallyBound() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingPartiallyBound(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean descriptorBindingVariableDescriptorCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorBindingVariableDescriptorCount(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean runtimeDescriptorArray() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nruntimeDescriptorArray(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean samplerFilterMinmax() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamplerFilterMinmax(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean scalarBlockLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nscalarBlockLayout(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean imagelessFramebuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimagelessFramebuffer(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean uniformBufferStandardLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nuniformBufferStandardLayout(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderSubgroupExtendedTypes() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderSubgroupExtendedTypes(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean separateDepthStencilLayouts() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nseparateDepthStencilLayouts(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean hostQueryReset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nhostQueryReset(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean timelineSemaphore() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntimelineSemaphore(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean bufferDeviceAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferDeviceAddress(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean bufferDeviceAddressCaptureReplay() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferDeviceAddressCaptureReplay(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean bufferDeviceAddressMultiDevice() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferDeviceAddressMultiDevice(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vulkanMemoryModel() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvulkanMemoryModel(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vulkanMemoryModelDeviceScope() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvulkanMemoryModelDeviceScope(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean vulkanMemoryModelAvailabilityVisibilityChains() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvulkanMemoryModelAvailabilityVisibilityChains(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderOutputViewportIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderOutputViewportIndex(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean shaderOutputLayer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nshaderOutputLayer(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean subgroupBroadcastDynamicId() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsubgroupBroadcastDynamicId(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 51
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features samplerMirrorClampToEdge(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsamplerMirrorClampToEdge(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features drawIndirectCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndrawIndirectCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features storageBuffer8BitAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstorageBuffer8BitAccess(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features uniformAndStorageBuffer8BitAccess(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nuniformAndStorageBuffer8BitAccess(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features storagePushConstant8(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nstoragePushConstant8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderBufferInt64Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderBufferInt64Atomics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderSharedInt64Atomics(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSharedInt64Atomics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderFloat16(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderFloat16(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderInt8(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderInt8(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderInputAttachmentArrayDynamicIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderUniformTexelBufferArrayDynamicIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderStorageTexelBufferArrayDynamicIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderUniformBufferArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSampledImageArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderStorageBufferArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderStorageImageArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderInputAttachmentArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderUniformTexelBufferArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderStorageTexelBufferArrayNonUniformIndexing(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingUniformBufferUpdateAfterBind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingSampledImageUpdateAfterBind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingStorageImageUpdateAfterBind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingStorageBufferUpdateAfterBind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingUpdateUnusedWhilePending(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingPartiallyBound(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ndescriptorBindingVariableDescriptorCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nruntimeDescriptorArray(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features samplerFilterMinmax(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsamplerFilterMinmax(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features scalarBlockLayout(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nscalarBlockLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features imagelessFramebuffer(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nimagelessFramebuffer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features uniformBufferStandardLayout(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nuniformBufferStandardLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderSubgroupExtendedTypes(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderSubgroupExtendedTypes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features separateDepthStencilLayouts(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nseparateDepthStencilLayouts(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features hostQueryReset(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nhostQueryReset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features timelineSemaphore(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            ntimelineSemaphore(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features bufferDeviceAddress(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbufferDeviceAddress(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features bufferDeviceAddressCaptureReplay(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbufferDeviceAddressCaptureReplay(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features bufferDeviceAddressMultiDevice(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nbufferDeviceAddressMultiDevice(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features vulkanMemoryModel(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvulkanMemoryModel(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features vulkanMemoryModelDeviceScope(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvulkanMemoryModelDeviceScope(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features vulkanMemoryModelAvailabilityVisibilityChains(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nvulkanMemoryModelAvailabilityVisibilityChains(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderOutputViewportIndex(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderOutputViewportIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features shaderOutputLayer(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nshaderOutputLayer(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features subgroupBroadcastDynamicId(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nsubgroupBroadcastDynamicId(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27, boolean r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, boolean r52, boolean r53, boolean r54) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.samplerMirrorClampToEdge(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.drawIndirectCount(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.storageBuffer8BitAccess(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.uniformAndStorageBuffer8BitAccess(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.storagePushConstant8(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderBufferInt64Atomics(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderSharedInt64Atomics(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderFloat16(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderInt8(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorIndexing(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderInputAttachmentArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderUniformTexelBufferArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderStorageTexelBufferArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderUniformBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderSampledImageArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderStorageBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderStorageImageArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderInputAttachmentArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderUniformTexelBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderStorageTexelBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r28
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingUniformBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r29
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingSampledImageUpdateAfterBind(r1)
            r0 = r4
            r1 = r30
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingStorageImageUpdateAfterBind(r1)
            r0 = r4
            r1 = r31
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingStorageBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r32
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingUniformTexelBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r33
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingStorageTexelBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r34
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingUpdateUnusedWhilePending(r1)
            r0 = r4
            r1 = r35
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingPartiallyBound(r1)
            r0 = r4
            r1 = r36
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.descriptorBindingVariableDescriptorCount(r1)
            r0 = r4
            r1 = r37
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.runtimeDescriptorArray(r1)
            r0 = r4
            r1 = r38
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.samplerFilterMinmax(r1)
            r0 = r4
            r1 = r39
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.scalarBlockLayout(r1)
            r0 = r4
            r1 = r40
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.imagelessFramebuffer(r1)
            r0 = r4
            r1 = r41
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.uniformBufferStandardLayout(r1)
            r0 = r4
            r1 = r42
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderSubgroupExtendedTypes(r1)
            r0 = r4
            r1 = r43
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.separateDepthStencilLayouts(r1)
            r0 = r4
            r1 = r44
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.hostQueryReset(r1)
            r0 = r4
            r1 = r45
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.timelineSemaphore(r1)
            r0 = r4
            r1 = r46
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.bufferDeviceAddress(r1)
            r0 = r4
            r1 = r47
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.bufferDeviceAddressCaptureReplay(r1)
            r0 = r4
            r1 = r48
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.bufferDeviceAddressMultiDevice(r1)
            r0 = r4
            r1 = r49
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.vulkanMemoryModel(r1)
            r0 = r4
            r1 = r50
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.vulkanMemoryModelDeviceScope(r1)
            r0 = r4
            r1 = r51
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.vulkanMemoryModelAvailabilityVisibilityChains(r1)
            r0 = r4
            r1 = r52
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderOutputViewportIndex(r1)
            r0 = r4
            r1 = r53
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.shaderOutputLayer(r1)
            r0 = r4
            r1 = r54
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.subgroupBroadcastDynamicId(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features set(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nsamplerMirrorClampToEdge(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndrawIndirectCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstorageBuffer8BitAccess(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nuniformAndStorageBuffer8BitAccess(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nstoragePushConstant8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderBufferInt64Atomics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSharedInt64Atomics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderFloat16(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderInt8(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINT8
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderInputAttachmentArrayDynamicIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSampledImageArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageImageArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingSampledImageUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingStorageImageUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingUpdateUnusedWhilePending(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingPartiallyBound(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingVariableDescriptorCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nruntimeDescriptorArray(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsamplerFilterMinmax(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nscalarBlockLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimagelessFramebuffer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nuniformBufferStandardLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSubgroupExtendedTypes(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nseparateDepthStencilLayouts(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nhostQueryReset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntimelineSemaphore(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbufferDeviceAddress(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbufferDeviceAddressCaptureReplay(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbufferDeviceAddressMultiDevice(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvulkanMemoryModel(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvulkanMemoryModelDeviceScope(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nvulkanMemoryModelAvailabilityVisibilityChains(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderOutputViewportIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderOutputLayer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsubgroupBroadcastDynamicId(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsamplerMirrorClampToEdge(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndrawIndirectCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstorageBuffer8BitAccess(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nuniformAndStorageBuffer8BitAccess(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nstoragePushConstant8(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderBufferInt64Atomics(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSharedInt64Atomics(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderFloat16(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERFLOAT16
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderInt8(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINT8
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderInputAttachmentArrayDynamicIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderUniformBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSampledImageArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageImageArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderInputAttachmentArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingSampledImageUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingStorageImageUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingUpdateUnusedWhilePending(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingPartiallyBound(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingVariableDescriptorCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nruntimeDescriptorArray(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsamplerFilterMinmax(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nscalarBlockLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimagelessFramebuffer(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nuniformBufferStandardLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSubgroupExtendedTypes(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nseparateDepthStencilLayouts(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nhostQueryReset(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntimelineSemaphore(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbufferDeviceAddress(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbufferDeviceAddressCaptureReplay(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbufferDeviceAddressMultiDevice(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvulkanMemoryModel(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvulkanMemoryModelDeviceScope(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nvulkanMemoryModelAvailabilityVisibilityChains(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderOutputViewportIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderOutputLayer(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsubgroupBroadcastDynamicId(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 49
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.POINTER_SIZE
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
            r1 = r0
            r2 = 25
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 26
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 27
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 28
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 29
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 30
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 31
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 32
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 33
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 34
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 35
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 36
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 37
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 38
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 39
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 40
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 41
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 42
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 43
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 44
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 45
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 46
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 47
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 48
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERMIRRORCLAMPTOEDGE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DRAWINDIRECTCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEBUFFER8BITACCESS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMANDSTORAGEBUFFER8BITACCESS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.STORAGEPUSHCONSTANT8 = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERBUFFERINT64ATOMICS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSHAREDINT64ATOMICS = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERFLOAT16 = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINT8 = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORINDEXING = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 26
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 27
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 28
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = r0
            r0 = r5
            r1 = 29
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGPARTIALLYBOUND = r0
            r0 = r5
            r1 = 30
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = r0
            r0 = r5
            r1 = 31
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.RUNTIMEDESCRIPTORARRAY = r0
            r0 = r5
            r1 = 32
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SAMPLERFILTERMINMAX = r0
            r0 = r5
            r1 = 33
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SCALARBLOCKLAYOUT = r0
            r0 = r5
            r1 = 34
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.IMAGELESSFRAMEBUFFER = r0
            r0 = r5
            r1 = 35
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.UNIFORMBUFFERSTANDARDLAYOUT = r0
            r0 = r5
            r1 = 36
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADERSUBGROUPEXTENDEDTYPES = r0
            r0 = r5
            r1 = 37
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SEPARATEDEPTHSTENCILLAYOUTS = r0
            r0 = r5
            r1 = 38
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.HOSTQUERYRESET = r0
            r0 = r5
            r1 = 39
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.TIMELINESEMAPHORE = r0
            r0 = r5
            r1 = 40
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESS = r0
            r0 = r5
            r1 = 41
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSCAPTUREREPLAY = r0
            r0 = r5
            r1 = 42
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.BUFFERDEVICEADDRESSMULTIDEVICE = r0
            r0 = r5
            r1 = 43
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODEL = r0
            r0 = r5
            r1 = 44
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELDEVICESCOPE = r0
            r0 = r5
            r1 = 45
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.VULKANMEMORYMODELAVAILABILITYVISIBILITYCHAINS = r0
            r0 = r5
            r1 = 46
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTVIEWPORTINDEX = r0
            r0 = r5
            r1 = 47
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SHADEROUTPUTLAYER = r0
            r0 = r5
            r1 = 48
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features.SUBGROUPBROADCASTDYNAMICID = r0
            return
    }
}
