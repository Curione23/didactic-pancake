package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCreateInfo.class */
public class VkImageCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkImageCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int IMAGETYPE = 0;
    public static final int FORMAT = 0;
    public static final int EXTENT = 0;
    public static final int MIPLEVELS = 0;
    public static final int ARRAYLAYERS = 0;
    public static final int SAMPLES = 0;
    public static final int TILING = 0;
    public static final int USAGE = 0;
    public static final int SHARINGMODE = 0;
    public static final int QUEUEFAMILYINDEXCOUNT = 0;
    public static final int PQUEUEFAMILYINDICES = 0;
    public static final int INITIALLAYOUT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkImageCreateInfo, org.lwjgl.vulkan.VkImageCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkImageCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkImageCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageCreateInfo r0 = org.lwjgl.vulkan.VkImageCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkImageCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageType")
        public int imageType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nimageType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int format() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nformat(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent3D extent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkImageCreateInfo.nextent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int mipLevels() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nmipLevels(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int arrayLayers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.narrayLayers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSampleCountFlagBits")
        public int samples() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nsamples(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageTiling")
        public int tiling() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.ntiling(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageUsageFlags")
        public int usage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nusage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSharingMode")
        public int sharingMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nsharingMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueFamilyIndexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.nqueueFamilyIndexCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pQueueFamilyIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkImageCreateInfo.npQueueFamilyIndices(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageLayout")
        public int initialLayout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkImageCreateInfo.ninitialLayout(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 14
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDedicatedAllocationImageCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDedicatedAllocationImageCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalFormatANDROID r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalFormatANDROID r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageCompressionControlEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageCompressionControlEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageDrmFormatModifierExplicitCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageDrmFormatModifierExplicitCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageDrmFormatModifierListCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageDrmFormatModifierListCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageFormatListCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageStencilUsageCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageStencilUsageCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageStencilUsageCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageStencilUsageCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImageSwapchainCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageSwapchainCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImportMetalIOSurfaceInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImportMetalIOSurfaceInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkImportMetalTextureInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImportMetalTextureInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkOpticalFlowImageFormatInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpticalFlowImageFormatInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoProfileListInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoProfileListInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkImageCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer imageType(@org.lwjgl.system.NativeType("VkImageType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nimageType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nformat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer extent(org.lwjgl.vulkan.VkExtent3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nextent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer extent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent3D r1 = r1.extent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer mipLevels(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nmipLevels(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer arrayLayers(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.narrayLayers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer samples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nsamples(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer tiling(@org.lwjgl.system.NativeType("VkImageTiling") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.ntiling(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer usage(@org.lwjgl.system.NativeType("VkImageUsageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nusage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer sharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nsharingMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.nqueueFamilyIndexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer pQueueFamilyIndices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.npQueueFamilyIndices(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkImageCreateInfo.Buffer initialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageCreateInfo.ninitialLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageCreateInfo r0 = org.lwjgl.vulkan.VkImageCreateInfo.create(r0)
                org.lwjgl.vulkan.VkImageCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkImageCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageType")
    public int imageType() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageType(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int format() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nformat(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent3D extent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent3D r0 = nextent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int mipLevels() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmipLevels(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int arrayLayers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = narrayLayers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSampleCountFlagBits")
    public int samples() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsamples(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageTiling")
    public int tiling() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ntiling(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageUsageFlags")
    public int usage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nusage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSharingMode")
    public int sharingMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsharingMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int queueFamilyIndexCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueueFamilyIndexCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pQueueFamilyIndices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npQueueFamilyIndices(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageLayout")
    public int initialLayout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ninitialLayout(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 14
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkDedicatedAllocationImageCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDedicatedAllocationImageCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkExternalFormatANDROID r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalFormatANDROID r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryImageCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryImageCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageCompressionControlEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageCompressionControlEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageDrmFormatModifierExplicitCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageDrmFormatModifierExplicitCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageDrmFormatModifierListCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageDrmFormatModifierListCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageFormatListCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageStencilUsageCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageStencilUsageCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageStencilUsageCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageStencilUsageCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImageSwapchainCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageSwapchainCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImportMetalIOSurfaceInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImportMetalIOSurfaceInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkImportMetalTextureInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImportMetalTextureInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkOpticalFlowImageFormatInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpticalFlowImageFormatInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pNext(org.lwjgl.vulkan.VkVideoProfileListInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoProfileListInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo flags(@org.lwjgl.system.NativeType("VkImageCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo imageType(@org.lwjgl.system.NativeType("VkImageType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo format(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nformat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo extent(org.lwjgl.vulkan.VkExtent3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nextent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo extent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent3D r1 = r1.extent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo mipLevels(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmipLevels(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo arrayLayers(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            narrayLayers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo samples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsamples(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo tiling(@org.lwjgl.system.NativeType("VkImageTiling") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ntiling(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo usage(@org.lwjgl.system.NativeType("VkImageUsageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo sharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsharingMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueueFamilyIndexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo pQueueFamilyIndices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQueueFamilyIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo initialLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninitialLayout(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo set(int r5, long r6, int r8, int r9, int r10, org.lwjgl.vulkan.VkExtent3D r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, @javax.annotation.Nullable java.nio.IntBuffer r19, int r20) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.imageType(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.format(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.extent(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.mipLevels(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.arrayLayers(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.samples(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.tiling(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.usage(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.sharingMode(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.queueFamilyIndexCount(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.pQueueFamilyIndices(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.initialLayout(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageCreateInfo set(org.lwjgl.vulkan.VkImageCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo malloc() {
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo calloc() {
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkImageCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageCreateInfo r0 = new org.lwjgl.vulkan.VkImageCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkImageCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.IMAGETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nformat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent3D nextent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCreateInfo.EXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkExtent3D.create(r0)
            return r0
    }

    public static int nmipLevels(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.MIPLEVELS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int narrayLayers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.ARRAYLAYERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsamples(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ntiling(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.TILING
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nusage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsharingMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SHARINGMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueueFamilyIndexCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npQueueFamilyIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCreateInfo.PQUEUEFAMILYINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nqueueFamilyIndexCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int ninitialLayout(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.INITIALLAYOUT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.IMAGETYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nformat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.FORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nextent(long r7, org.lwjgl.vulkan.VkExtent3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkImageCreateInfo.EXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nmipLevels(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.MIPLEVELS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void narrayLayers(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.ARRAYLAYERS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsamples(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SAMPLES
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ntiling(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.TILING
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nusage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsharingMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.SHARINGMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueueFamilyIndexCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npQueueFamilyIndices(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkImageCreateInfo.PQUEUEFAMILYINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nqueueFamilyIndexCount(r0, r1)
        L19:
            return
    }

    public static void ninitialLayout(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkImageCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.INITIALLAYOUT
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
            org.lwjgl.vulkan.VkImageCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 15
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.vulkan.VkImageCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkImageCreateInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkImageCreateInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.IMAGETYPE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.FORMAT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.EXTENT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.MIPLEVELS = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.ARRAYLAYERS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.SAMPLES = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.TILING = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.USAGE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.SHARINGMODE = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.QUEUEFAMILYINDEXCOUNT = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.PQUEUEFAMILYINDICES = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkImageCreateInfo.INITIALLAYOUT = r0
            return
    }
}
