package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures.class */
public class VkPhysicalDeviceDescriptorIndexingFeatures extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
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

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeatures$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean shaderInputAttachmentArrayDynamicIndexing() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayDynamicIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayDynamicIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayDynamicIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformBufferArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderSampledImageArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageBufferArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageImageArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayNonUniformIndexing(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformBufferUpdateAfterBind(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingSampledImageUpdateAfterBind(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageImageUpdateAfterBind(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageBufferUpdateAfterBind(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUpdateUnusedWhilePending(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingPartiallyBound(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingVariableDescriptorCount(r0)
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
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nruntimeDescriptorArray(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000161001(0x3b9d3ee9, float:0.0047987592)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderSampledImageArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageImageArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderInputAttachmentArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderUniformTexelBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nshaderStorageTexelBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingSampledImageUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageImageUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingUpdateUnusedWhilePending(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingPartiallyBound(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ndescriptorBindingVariableDescriptorCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.nruntimeDescriptorArray(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDescriptorIndexingFeatures(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDescriptorIndexingFeatures(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000161001(0x3b9d3ee9, float:0.0047987592)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderInputAttachmentArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderUniformTexelBufferArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderStorageTexelBufferArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderUniformBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderSampledImageArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderStorageBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderStorageImageArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderInputAttachmentArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderUniformTexelBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.shaderStorageTexelBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingUniformBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingSampledImageUpdateAfterBind(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingStorageImageUpdateAfterBind(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingStorageBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingUniformTexelBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingStorageTexelBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingUpdateUnusedWhilePending(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingPartiallyBound(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.descriptorBindingVariableDescriptorCount(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.runtimeDescriptorArray(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures set(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nshaderInputAttachmentArrayDynamicIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformTexelBufferArrayDynamicIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageTexelBufferArrayDynamicIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderSampledImageArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageImageArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderInputAttachmentArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderUniformTexelBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nshaderStorageTexelBufferArrayNonUniformIndexing(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingUniformBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingSampledImageUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingStorageImageUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingStorageBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingUniformTexelBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingStorageTexelBufferUpdateAfterBind(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingUpdateUnusedWhilePending(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingPartiallyBound(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ndescriptorBindingVariableDescriptorCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nruntimeDescriptorArray(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nshaderInputAttachmentArrayDynamicIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderUniformTexelBufferArrayDynamicIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageTexelBufferArrayDynamicIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderUniformBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderSampledImageArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageImageArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderInputAttachmentArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderUniformTexelBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nshaderStorageTexelBufferArrayNonUniformIndexing(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingUniformBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingSampledImageUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingStorageImageUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingStorageBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingUniformTexelBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingStorageTexelBufferUpdateAfterBind(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingUpdateUnusedWhilePending(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingPartiallyBound(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ndescriptorBindingVariableDescriptorCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nruntimeDescriptorArray(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY
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
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 22
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.POINTER_SIZE
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
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYDYNAMICINDEXING = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYDYNAMICINDEXING = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYDYNAMICINDEXING = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSAMPLEDIMAGEARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGEIMAGEARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERINPUTATTACHMENTARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERUNIFORMTEXELBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.SHADERSTORAGETEXELBUFFERARRAYNONUNIFORMINDEXING = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSAMPLEDIMAGEUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEIMAGEUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGEBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUNIFORMTEXELBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGSTORAGETEXELBUFFERUPDATEAFTERBIND = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGUPDATEUNUSEDWHILEPENDING = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGPARTIALLYBOUND = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.DESCRIPTORBINDINGVARIABLEDESCRIPTORCOUNT = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.RUNTIMEDESCRIPTORARRAY = r0
            return
    }
}
