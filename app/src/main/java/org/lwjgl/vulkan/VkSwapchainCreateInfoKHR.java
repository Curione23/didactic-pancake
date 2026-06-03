package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR.class */
public class VkSwapchainCreateInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkSwapchainCreateInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int SURFACE = 0;
    public static final int MINIMAGECOUNT = 0;
    public static final int IMAGEFORMAT = 0;
    public static final int IMAGECOLORSPACE = 0;
    public static final int IMAGEEXTENT = 0;
    public static final int IMAGEARRAYLAYERS = 0;
    public static final int IMAGEUSAGE = 0;
    public static final int IMAGESHARINGMODE = 0;
    public static final int QUEUEFAMILYINDEXCOUNT = 0;
    public static final int PQUEUEFAMILYINDICES = 0;
    public static final int PRETRANSFORM = 0;
    public static final int COMPOSITEALPHA = 0;
    public static final int PRESENTMODE = 0;
    public static final int CLIPPED = 0;
    public static final int OLDSWAPCHAIN = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSwapchainCreateInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkSwapchainCreateInfoKHR, org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkSwapchainCreateInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSwapchainCreateInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSwapchainCreateFlagsKHR")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSurfaceKHR")
        public long surface() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nsurface(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int minImageCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nminImageCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFormat")
        public int imageFormat() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageFormat(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkColorSpaceKHR")
        public int imageColorSpace() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageColorSpace(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent2D imageExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageExtent(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int imageArrayLayers() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageArrayLayers(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkImageUsageFlags")
        public int imageUsage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageUsage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSharingMode")
        public int imageSharingMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageSharingMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueFamilyIndexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pQueueFamilyIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npQueueFamilyIndices(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR")
        public int preTransform() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npreTransform(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkCompositeAlphaFlagBitsKHR")
        public int compositeAlpha() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ncompositeAlpha(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPresentModeKHR")
        public int presentMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npresentMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean clipped() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nclipped(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkSwapchainKHR")
        public long oldSwapchain() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.noldSwapchain(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000001000(0x3b9acde8, float:0.004724253)
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupSwapchainCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupSwapchainCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkImageCompressionControlEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageCompressionControlEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageFormatListCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveWin32InfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveWin32InfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainCounterCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainCounterCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainDisplayNativeHdrCreateInfoAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainDisplayNativeHdrCreateInfoAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainPresentBarrierCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainPresentBarrierCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pNext(org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkSwapchainCreateFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer surface(@org.lwjgl.system.NativeType("VkSurfaceKHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nsurface(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer minImageCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nminImageCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageFormat(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageColorSpace(@org.lwjgl.system.NativeType("VkColorSpaceKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageColorSpace(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageExtent(org.lwjgl.vulkan.VkExtent2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageExtent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent2D r1 = r1.imageExtent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageArrayLayers(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageArrayLayers(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageUsage(@org.lwjgl.system.NativeType("VkImageUsageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageUsage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer imageSharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nimageSharingMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nqueueFamilyIndexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer pQueueFamilyIndices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npQueueFamilyIndices(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer preTransform(@org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npreTransform(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer compositeAlpha(@org.lwjgl.system.NativeType("VkCompositeAlphaFlagBitsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ncompositeAlpha(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer presentMode(@org.lwjgl.system.NativeType("VkPresentModeKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.npresentMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer clipped(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.nclipped(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer oldSwapchain(@org.lwjgl.system.NativeType("VkSwapchainKHR") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.noldSwapchain(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.create(r0)
                org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSwapchainCreateInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSwapchainCreateInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSwapchainCreateInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkSwapchainCreateFlagsKHR")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSurfaceKHR")
    public long surface() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsurface(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int minImageCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nminImageCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFormat")
    public int imageFormat() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageFormat(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkColorSpaceKHR")
    public int imageColorSpace() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageColorSpace(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent2D imageExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent2D r0 = nimageExtent(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int imageArrayLayers() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageArrayLayers(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkImageUsageFlags")
    public int imageUsage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageUsage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSharingMode")
    public int imageSharingMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nimageSharingMode(r0)
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

    @org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR")
    public int preTransform() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npreTransform(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkCompositeAlphaFlagBitsKHR")
    public int compositeAlpha() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncompositeAlpha(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPresentModeKHR")
    public int presentMode() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npresentMode(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean clipped() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclipped(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkSwapchainKHR")
    public long oldSwapchain() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = noldSwapchain(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000001000(0x3b9acde8, float:0.004724253)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkDeviceGroupSwapchainCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupSwapchainCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkImageCompressionControlEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageCompressionControlEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageFormatListCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkImageFormatListCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveWin32InfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSurfaceFullScreenExclusiveWin32InfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainCounterCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainCounterCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainDisplayNativeHdrCreateInfoAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainDisplayNativeHdrCreateInfoAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainPresentBarrierCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainPresentBarrierCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainPresentModesCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pNext(org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkSwapchainPresentScalingCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR flags(@org.lwjgl.system.NativeType("VkSwapchainCreateFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR surface(@org.lwjgl.system.NativeType("VkSurfaceKHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsurface(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR minImageCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nminImageCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageFormat(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageColorSpace(@org.lwjgl.system.NativeType("VkColorSpaceKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageColorSpace(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageExtent(org.lwjgl.vulkan.VkExtent2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageExtent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent2D r1 = r1.imageExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageArrayLayers(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageArrayLayers(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageUsage(@org.lwjgl.system.NativeType("VkImageUsageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageUsage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR imageSharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageSharingMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueueFamilyIndexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR pQueueFamilyIndices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQueueFamilyIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR preTransform(@org.lwjgl.system.NativeType("VkSurfaceTransformFlagBitsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npreTransform(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR compositeAlpha(@org.lwjgl.system.NativeType("VkCompositeAlphaFlagBitsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncompositeAlpha(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR presentMode(@org.lwjgl.system.NativeType("VkPresentModeKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npresentMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR clipped(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
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
            nclipped(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR oldSwapchain(@org.lwjgl.system.NativeType("VkSwapchainKHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            noldSwapchain(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR set(int r5, long r6, int r8, long r9, int r11, int r12, int r13, org.lwjgl.vulkan.VkExtent2D r14, int r15, int r16, int r17, int r18, @javax.annotation.Nullable java.nio.IntBuffer r19, int r20, int r21, int r22, boolean r23, long r24) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.surface(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.minImageCount(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.imageFormat(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.imageColorSpace(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.imageExtent(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.imageArrayLayers(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.imageUsage(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.imageSharingMode(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.queueFamilyIndexCount(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.pQueueFamilyIndices(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.preTransform(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.compositeAlpha(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.presentMode(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.clipped(r1)
            r0 = r4
            r1 = r24
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.oldSwapchain(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSwapchainCreateInfoKHR set(org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR malloc() {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR calloc() {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkSwapchainCreateInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsurface(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SURFACE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nminImageCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.MINIMAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageFormat(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageColorSpace(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGECOLORSPACE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent2D nimageExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent2D r0 = org.lwjgl.vulkan.VkExtent2D.create(r0)
            return r0
    }

    public static int nimageArrayLayers(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageUsage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEUSAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nimageSharingMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGESHARINGMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueueFamilyIndexCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npQueueFamilyIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nqueueFamilyIndexCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static int npreTransform(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PRETRANSFORM
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncompositeAlpha(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.COMPOSITEALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npresentMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PRESENTMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nclipped(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.CLIPPED
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long noldSwapchain(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.OLDSWAPCHAIN
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsurface(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SURFACE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nminImageCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.MINIMAGECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageFormat(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEFORMAT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageColorSpace(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGECOLORSPACE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageExtent(long r7, org.lwjgl.vulkan.VkExtent2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEEXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nimageArrayLayers(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageUsage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEUSAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageSharingMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGESHARINGMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueueFamilyIndexCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npQueueFamilyIndices(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES
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

    public static void npreTransform(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PRETRANSFORM
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncompositeAlpha(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.COMPOSITEALPHA
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npresentMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PRESENTMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nclipped(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.CLIPPED
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void noldSwapchain(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.OLDSWAPCHAIN
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 18
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
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
            int r3 = org.lwjgl.vulkan.VkExtent2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            int r3 = org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.POINTER_SIZE
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.SURFACE = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.MINIMAGECOUNT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEFORMAT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGECOLORSPACE = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEEXTENT = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEARRAYLAYERS = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGEUSAGE = r0
            r0 = r6
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.IMAGESHARINGMODE = r0
            r0 = r6
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.QUEUEFAMILYINDEXCOUNT = r0
            r0 = r6
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PQUEUEFAMILYINDICES = r0
            r0 = r6
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PRETRANSFORM = r0
            r0 = r6
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.COMPOSITEALPHA = r0
            r0 = r6
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.PRESENTMODE = r0
            r0 = r6
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.CLIPPED = r0
            r0 = r6
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkSwapchainCreateInfoKHR.OLDSWAPCHAIN = r0
            return
    }
}
