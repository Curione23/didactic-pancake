package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT.class */
public class VkPhysicalDeviceDescriptorIndexingFeaturesEXT extends org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000161001(0x3b9d3ee9, float:0.0047987592)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayDynamicIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderSampledImageArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageImageArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderInputAttachmentArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderUniformTexelBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nshaderStorageTexelBufferArrayNonUniformIndexing(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingSampledImageUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageImageUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUniformTexelBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingStorageTexelBufferUpdateAfterBind(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingUpdateUnusedWhilePending(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingPartiallyBound(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ndescriptorBindingVariableDescriptorCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.nruntimeDescriptorArray(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.runtimeDescriptorArray(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingVariableDescriptorCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingPartiallyBound(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingUpdateUnusedWhilePending(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingStorageTexelBufferUpdateAfterBind(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingUniformTexelBufferUpdateAfterBind(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingStorageBufferUpdateAfterBind(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingStorageImageUpdateAfterBind(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingSampledImageUpdateAfterBind(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.descriptorBindingUniformBufferUpdateAfterBind(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderStorageTexelBufferArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderUniformTexelBufferArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderInputAttachmentArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderStorageImageArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderStorageBufferArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderSampledImageArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderUniformBufferArrayNonUniformIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderStorageTexelBufferArrayDynamicIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderUniformTexelBufferArrayDynamicIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.shaderInputAttachmentArrayDynamicIndexing(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDescriptorIndexingFeaturesEXT(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDescriptorIndexingFeaturesEXT(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000161001(0x3b9d3ee9, float:0.0047987592)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(int r5, long r6, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25, boolean r26, boolean r27) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderInputAttachmentArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderUniformTexelBufferArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageTexelBufferArrayDynamicIndexing(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderUniformBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderSampledImageArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageImageArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderInputAttachmentArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderUniformTexelBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageTexelBufferArrayNonUniformIndexing(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingUniformBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingSampledImageUpdateAfterBind(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingStorageImageUpdateAfterBind(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingStorageBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingUniformTexelBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingStorageTexelBufferUpdateAfterBind(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingUpdateUnusedWhilePending(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingPartiallyBound(r1)
            r0 = r4
            r1 = r26
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingVariableDescriptorCount(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.runtimeDescriptorArray(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT set(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures set(int r26, long r27, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, boolean r38, boolean r39, boolean r40, boolean r41, boolean r42, boolean r43, boolean r44, boolean r45, boolean r46, boolean r47, boolean r48) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r13 = r39
            r14 = r40
            r15 = r41
            r16 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r22 = r48
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures runtimeDescriptorArray(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.runtimeDescriptorArray(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingVariableDescriptorCount(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingVariableDescriptorCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingPartiallyBound(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingPartiallyBound(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUpdateUnusedWhilePending(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingUpdateUnusedWhilePending(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingStorageTexelBufferUpdateAfterBind(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformTexelBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingUniformTexelBufferUpdateAfterBind(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingStorageBufferUpdateAfterBind(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingStorageImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingStorageImageUpdateAfterBind(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingSampledImageUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingSampledImageUpdateAfterBind(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures descriptorBindingUniformBufferUpdateAfterBind(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.descriptorBindingUniformBufferUpdateAfterBind(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageTexelBufferArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderUniformTexelBufferArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderInputAttachmentArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageImageArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageBufferArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderSampledImageArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderSampledImageArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformBufferArrayNonUniformIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderUniformBufferArrayNonUniformIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderStorageTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderStorageTexelBufferArrayDynamicIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderUniformTexelBufferArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderUniformTexelBufferArrayDynamicIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures shaderInputAttachmentArrayDynamicIndexing(@org.lwjgl.system.NativeType("VkBool32") boolean r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.shaderInputAttachmentArrayDynamicIndexing(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures pNext(@org.lwjgl.system.NativeType("void *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r0 = r0.create(r1, r2)
            return r0
    }
}
