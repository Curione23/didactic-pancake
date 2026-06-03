package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceCreateInfo.class */
public class VkDeviceCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDeviceCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int QUEUECREATEINFOCOUNT = 0;
    public static final int PQUEUECREATEINFOS = 0;
    public static final int ENABLEDLAYERCOUNT = 0;
    public static final int PPENABLEDLAYERNAMES = 0;
    public static final int ENABLEDEXTENSIONCOUNT = 0;
    public static final int PPENABLEDEXTENSIONNAMES = 0;
    public static final int PENABLEDFEATURES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDeviceCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDeviceCreateInfo, org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDeviceCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkDeviceCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDeviceCreateInfo r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueCreateInfoCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nqueueCreateInfoCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceQueueCreateInfo const *")
        public org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkDeviceQueueCreateInfo$Buffer r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.npQueueCreateInfos(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int enabledLayerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nenabledLayerCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const * const *")
        public org.lwjgl.PointerBuffer ppEnabledLayerNames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nppEnabledLayerNames(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int enabledExtensionCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nenabledExtensionCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("char const * const *")
        public org.lwjgl.PointerBuffer ppEnabledExtensionNames() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.PointerBuffer r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.nppEnabledExtensionNames(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures const *")
        public org.lwjgl.vulkan.VkPhysicalDeviceFeatures pEnabledFeatures() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkPhysicalDeviceFeatures r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.npEnabledFeatures(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 3
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDeviceCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceDeviceMemoryReportCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceDeviceMemoryReportCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceDiagnosticsConfigCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceDiagnosticsConfigCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceMemoryOverallocationCreateInfoAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceMemoryOverallocationCreateInfoAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDevicePrivateDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDevicePrivateDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevice4444FormatsFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevice4444FormatsFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceASTCDecodeFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceASTCDecodeFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructureFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructureFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceAddressBindingReportFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceAddressBindingReportFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceAmigoProfilingFeaturesSEC r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceAmigoProfilingFeaturesSEC r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBorderColorSwizzleFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBorderColorSwizzleFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferAddressFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBufferAddressFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCoherentMemoryFeaturesAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCoherentMemoryFeaturesAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceColorWriteEnableFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceColorWriteEnableFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceConditionalRenderingFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceConditionalRenderingFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCornerSampledImageFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCornerSampledImageFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCoverageReductionModeFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCoverageReductionModeFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCubicClampFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCubicClampFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCubicWeightsFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCubicWeightsFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthBiasControlFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDepthBiasControlFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthClipControlFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDepthClipControlFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthClipEnableFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDepthClipEnableFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceMemoryReportFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDeviceMemoryReportFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDiagnosticsConfigFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDiagnosticsConfigFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExclusiveScissorFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExclusiveScissorFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState2FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState2FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicStateFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicStateFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryRDMAFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryRDMAFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFaultFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFaultFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFeatures2 r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFeatures2 r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFeatures2KHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFeatures2KHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFloat16Int8FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFloat16Int8FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceFrameBoundaryFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceFrameBoundaryFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImage2DViewOf3DFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImage2DViewOf3DFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2FeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2FeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageViewMinLodFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImageViewMinLodFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceInheritedViewportScissorFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceInheritedViewportScissorFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceInvocationMaskFeaturesHUAWEI r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceInvocationMaskFeaturesHUAWEI r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceLegacyDitheringFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceLegacyDitheringFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceLinearColorAttachmentFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceLinearColorAttachmentFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMemoryPriorityFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMemoryPriorityFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelinePropertiesFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelinePropertiesFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePresentBarrierFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePresentBarrierFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePresentIdFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePresentIdFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePresentWaitFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePresentWaitFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayQueryFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayQueryFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMotionBlurFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMotionBlurFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelineFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelineFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloatFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloatFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderClockFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderClockFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParameterFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParameterFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueueFeaturesAMDX r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueueFeaturesAMDX r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderImageFootprintFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderImageFootprintFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImageFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImageFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImageFeaturesNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImageFeaturesNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingFeaturesHUAWEI r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingFeaturesHUAWEI r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2FeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2FeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTilePropertiesFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTilePropertiesFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceYcbcrDegammaFeaturesQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceYcbcrDegammaFeaturesQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceYcbcrImageArraysFeaturesEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceYcbcrImageArraysFeaturesEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkDeviceCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pQueueCreateInfos(@org.lwjgl.system.NativeType("VkDeviceQueueCreateInfo const *") org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceCreateInfo.npQueueCreateInfos(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer ppEnabledLayerNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceCreateInfo.nppEnabledLayerNames(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer ppEnabledExtensionNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceCreateInfo.nppEnabledExtensionNames(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer pEnabledFeatures(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures const *") org.lwjgl.vulkan.VkPhysicalDeviceFeatures r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkDeviceCreateInfo.npEnabledFeatures(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDeviceCreateInfo r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.create(r0)
                org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDeviceCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDeviceCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDeviceCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("void const *")
    public long pNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npNext(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int queueCreateInfoCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueueCreateInfoCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceQueueCreateInfo const *")
    public org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkDeviceQueueCreateInfo$Buffer r0 = npQueueCreateInfos(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int enabledLayerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenabledLayerCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const * const *")
    public org.lwjgl.PointerBuffer ppEnabledLayerNames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppEnabledLayerNames(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int enabledExtensionCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nenabledExtensionCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const * const *")
    public org.lwjgl.PointerBuffer ppEnabledExtensionNames() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.PointerBuffer r0 = nppEnabledExtensionNames(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures const *")
    public org.lwjgl.vulkan.VkPhysicalDeviceFeatures pEnabledFeatures() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkPhysicalDeviceFeatures r0 = npEnabledFeatures(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 3
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDeviceDeviceMemoryReportCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceDeviceMemoryReportCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDeviceDiagnosticsConfigCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceDiagnosticsConfigCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupDeviceCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDeviceMemoryOverallocationCreateInfoAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceMemoryOverallocationCreateInfoAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDevicePrivateDataCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkDevicePrivateDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDevicePrivateDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevice16BitStorageFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevice4444FormatsFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevice4444FormatsFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevice8BitStorageFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceASTCDecodeFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceASTCDecodeFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructureFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceAccelerationStructureFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceAddressBindingReportFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceAddressBindingReportFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceAmigoProfilingFeaturesSEC r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceAmigoProfilingFeaturesSEC r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopDynamicStateFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceBorderColorSwizzleFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBorderColorSwizzleFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferAddressFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBufferAddressFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceBufferDeviceAddressFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCoherentMemoryFeaturesAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCoherentMemoryFeaturesAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceColorWriteEnableFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceColorWriteEnableFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceComputeShaderDerivativesFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceConditionalRenderingFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceConditionalRenderingFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCooperativeMatrixFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCopyMemoryIndirectFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCornerSampledImageFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCornerSampledImageFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCoverageReductionModeFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCoverageReductionModeFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCubicClampFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCubicClampFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCubicWeightsFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCubicWeightsFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceCustomBorderColorFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthBiasControlFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDepthBiasControlFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDepthClampZeroOneFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthClipControlFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDepthClipControlFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDepthClipEnableFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDepthClipEnableFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorIndexingFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceGeneratedCommandsFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDeviceMemoryReportFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDeviceMemoryReportFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDiagnosticsConfigFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDiagnosticsConfigFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDisplacementMicromapFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceDynamicRenderingUnusedAttachmentsFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceExclusiveScissorFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExclusiveScissorFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState2FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState2FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicState3FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicStateFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExtendedDynamicStateFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryRDMAFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceExternalMemoryRDMAFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFaultFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFaultFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFeatures2 r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFeatures2 r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFeatures2KHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFeatures2KHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFloat16Int8FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFloat16Int8FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMap2FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderBarycentricFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShaderInterlockFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateEnumsFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFragmentShadingRateFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceFrameBoundaryFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceFrameBoundaryFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceGlobalPriorityQueryFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceGraphicsPipelineLibraryFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceHostImageCopyFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceHostQueryResetFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImage2DViewOf3DFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImage2DViewOf3DFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageCompressionControlSwapchainFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2FeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageProcessing2FeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageProcessingFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageRobustnessFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageSlicedViewOf3DFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImageViewMinLodFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImageViewMinLodFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceImagelessFramebufferFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceIndexTypeUint8FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceInheritedViewportScissorFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceInheritedViewportScissorFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceInlineUniformBlockFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceInvocationMaskFeaturesHUAWEI r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceInvocationMaskFeaturesHUAWEI r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceLegacyDitheringFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceLegacyDitheringFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceLineRasterizationFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceLinearColorAttachmentFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceLinearColorAttachmentFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance4FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMaintenance5FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMemoryDecompressionFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMemoryPriorityFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMemoryPriorityFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMeshShaderFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiDrawFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewRenderAreasFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceMutableDescriptorTypeFeaturesVALVE r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceNonSeamlessCubeMapFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceOpacityMicromapFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceOpticalFlowFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePageableDeviceLocalMemoryFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePerformanceQueryFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineCreationCacheControlFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineExecutablePropertiesFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineLibraryGroupHandlesFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelinePropertiesFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelinePropertiesFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineProtectedAccessFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePipelineRobustnessFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePortabilitySubsetFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePresentBarrierFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePresentBarrierFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePresentIdFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePresentIdFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePresentWaitFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePresentWaitFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePrimitivesGeneratedQueryFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDevicePrivateDataFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceProtectedMemoryFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceProvokingVertexFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesARM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRasterizationOrderAttachmentAccessFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayQueryFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayQueryFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingInvocationReorderFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMotionBlurFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingMotionBlurFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelineFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPipelineFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRayTracingPositionFetchFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRepresentativeFragmentTestFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceRobustness2FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSamplerYcbcrConversionFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceScalarBlockLayoutFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSeparateDepthStencilLayoutsFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloat2FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloatFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicFloatFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderAtomicInt64FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderClockFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderClockFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderCoreBuiltinsFeaturesARM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderDemoteToHelperInvocationFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParameterFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParameterFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderDrawParametersFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEarlyAndLateFragmentTestsFeaturesAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueueFeaturesAMDX r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderEnqueueFeaturesAMDX r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderFloat16Int8FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderImageAtomicInt64FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderImageFootprintFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderImageFootprintFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerDotProductFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderIntegerFunctions2FeaturesINTEL r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderModuleIdentifierFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderObjectFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSMBuiltinsFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupExtendedTypesFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderSubgroupUniformControlFlowFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderTerminateInvocationFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImageFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShaderTileImageFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImageFeaturesNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceShadingRateImageFeaturesNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubgroupSizeControlFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubpassMergeFeedbackFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingFeaturesHUAWEI r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSubpassShadingFeaturesHUAWEI r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2FeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceSynchronization2FeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTexelBufferAlignmentFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTextureCompressionASTCHDRFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTilePropertiesFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTilePropertiesFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTimelineSemaphoreFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceTransformFeedbackFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceUniformBufferStandardLayoutFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVariablePointerFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVariablePointersFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVertexAttributeDivisorFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVertexInputDynamicStateFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan11Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan12Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkan13Features r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceVulkanMemoryModelFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceWorkgroupMemoryExplicitLayoutFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceYcbcrDegammaFeaturesQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceYcbcrDegammaFeaturesQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceYcbcrImageArraysFeaturesEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceYcbcrImageArraysFeaturesEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeatures r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pNext(org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPhysicalDeviceZeroInitializeWorkgroupMemoryFeaturesKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo flags(@org.lwjgl.system.NativeType("VkDeviceCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pQueueCreateInfos(@org.lwjgl.system.NativeType("VkDeviceQueueCreateInfo const *") org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQueueCreateInfos(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo ppEnabledLayerNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppEnabledLayerNames(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo ppEnabledExtensionNames(@javax.annotation.Nullable @org.lwjgl.system.NativeType("char const * const *") org.lwjgl.PointerBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nppEnabledExtensionNames(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo pEnabledFeatures(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkPhysicalDeviceFeatures const *") org.lwjgl.vulkan.VkPhysicalDeviceFeatures r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npEnabledFeatures(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo set(int r5, long r6, int r8, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer r9, @javax.annotation.Nullable org.lwjgl.PointerBuffer r10, @javax.annotation.Nullable org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkPhysicalDeviceFeatures r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pQueueCreateInfos(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.ppEnabledLayerNames(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.ppEnabledExtensionNames(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.pEnabledFeatures(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDeviceCreateInfo set(org.lwjgl.vulkan.VkDeviceCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo malloc() {
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo calloc() {
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkDeviceCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueueCreateInfoCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.QUEUECREATEINFOCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer npQueueCreateInfos(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PQUEUECREATEINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nqueueCreateInfoCount(r1)
            org.lwjgl.vulkan.VkDeviceQueueCreateInfo$Buffer r0 = org.lwjgl.vulkan.VkDeviceQueueCreateInfo.create(r0, r1)
            return r0
    }

    public static int nenabledLayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppEnabledLayerNames(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDLAYERNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nenabledLayerCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    public static int nenabledExtensionCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.PointerBuffer nppEnabledExtensionNames(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nenabledExtensionCount(r1)
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkPhysicalDeviceFeatures npEnabledFeatures(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PENABLEDFEATURES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkPhysicalDeviceFeatures r0 = org.lwjgl.vulkan.VkPhysicalDeviceFeatures.createSafe(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueueCreateInfoCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.QUEUECREATEINFOCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npQueueCreateInfos(long r5, org.lwjgl.vulkan.VkDeviceQueueCreateInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PQUEUECREATEINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nqueueCreateInfoCount(r0, r1)
            return
    }

    public static void nenabledLayerCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDLAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nppEnabledLayerNames(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDLAYERNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nenabledLayerCount(r0, r1)
            return
    }

    public static void nenabledExtensionCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkDeviceCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nppEnabledExtensionNames(long r5, @javax.annotation.Nullable org.lwjgl.PointerBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            nenabledExtensionCount(r0, r1)
            return
    }

    public static void npEnabledFeatures(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkPhysicalDeviceFeatures r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PENABLEDFEATURES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r6) {
            r0 = r6
            int r0 = nqueueCreateInfoCount(r0)
            r8 = r0
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PQUEUECREATEINFOS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r2 = org.lwjgl.vulkan.VkDeviceQueueCreateInfo.SIZEOF
            void r3 = org.lwjgl.vulkan.VkDeviceQueueCreateInfo::validate
            validate(r0, r1, r2, r3)
            r0 = r6
            int r0 = nenabledLayerCount(r0)
            if (r0 == 0) goto L35
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDLAYERNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L35:
            r0 = r6
            int r0 = nenabledExtensionCount(r0)
            if (r0 == 0) goto L49
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L49:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDeviceCreateInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkDeviceCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDeviceCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDeviceCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.QUEUECREATEINFOCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.PQUEUECREATEINFOS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDLAYERCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDLAYERNAMES = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDeviceCreateInfo.PENABLEDFEATURES = r0
            return
    }
}
