package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2.class */
public class VkPhysicalDeviceProperties2 extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceProperties2> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int PROPERTIES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceProperties2$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceProperties2, org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceProperties2 ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPhysicalDeviceProperties2 getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.npNext(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties properties() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.nproperties(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000059001(0x3b9bb079, float:0.004751262)
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructurePropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructurePropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceConservativeRasterizationPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceConservativeRasterizationPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolvePropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolvePropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDiscardRectanglePropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDiscardRectanglePropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDriverPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDriverPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDrmPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDrmPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3PropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3PropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryHostPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryHostPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2PropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2PropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceIDProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceIDProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceIDPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceIDPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2PropertiesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2PropertiesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingPropertiesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingPropertiesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceLayeredDriverPropertiesMSFT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceLayeredDriverPropertiesMSFT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3PropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3PropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5PropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5PropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePCIBusInfoPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePCIBusInfoPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePointClippingPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePointClippingPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSampleLocationsPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSampleLocationsPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreProperties2AMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreProperties2AMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesARM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesARM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsPropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsPropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImagePropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImagePropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImagePropertiesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImagePropertiesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingPropertiesHUAWEI r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingPropertiesHUAWEI r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphorePropertiesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphorePropertiesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceProperties2(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceProperties2 create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceProperties2(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
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

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties properties() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = nproperties(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000059001(0x3b9bb079, float:0.004751262)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructurePropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructurePropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceConservativeRasterizationPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceConservativeRasterizationPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolveProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolvePropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDepthStencilResolvePropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDiscardRectanglePropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDiscardRectanglePropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDriverProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDriverPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDriverPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceDrmPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDrmPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3PropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3PropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryHostPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryHostPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFloatControlsPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2PropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2PropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRatePropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceIDProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceIDProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceIDPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceIDPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2PropertiesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2PropertiesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingPropertiesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingPropertiesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceLayeredDriverPropertiesMSFT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceLayeredDriverPropertiesMSFT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3Properties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3PropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance3PropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Properties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4PropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5PropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5PropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewAttributesPropertiesNVX r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePCIBusInfoPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePCIBusInfoPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePointClippingProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePointClippingPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePointClippingPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePushDescriptorPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelinePropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRobustness2PropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSampleLocationsPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSampleLocationsPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSamplerFilterMinmaxPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsPropertiesARM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreProperties2AMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreProperties2AMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesARM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderCorePropertiesARM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueuePropertiesAMDX r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductPropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsPropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsPropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImagePropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImagePropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImagePropertiesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImagePropertiesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubgroupProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingPropertiesHUAWEI r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingPropertiesHUAWEI r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreProperties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphorePropertiesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphorePropertiesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorPropertiesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Properties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Properties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Properties r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 set(int r5, long r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.pNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceProperties2 set(org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2 calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties2.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceProperties2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceProperties nproperties(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkPhysicalDeviceProperties r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PNEXT
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
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2 r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 3
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties2.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.SIZEOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceProperties.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceProperties2.PROPERTIES = r0
            return
    }
}
