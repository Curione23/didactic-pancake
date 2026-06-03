package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocatorCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocatorCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaAllocatorCreateInfo.class */
public class VmaAllocatorCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaAllocatorCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int FLAGS = 0;
    public static final int PHYSICALDEVICE = 0;
    public static final int DEVICE = 0;
    public static final int PREFERREDLARGEHEAPBLOCKSIZE = 0;
    public static final int PALLOCATIONCALLBACKS = 0;
    public static final int PDEVICEMEMORYCALLBACKS = 0;
    public static final int PHEAPSIZELIMIT = 0;
    public static final int PVULKANFUNCTIONS = 0;
    public static final int INSTANCE = 0;
    public static final int VULKANAPIVERSION = 0;
    public static final int PTYPEEXTERNALMEMORYHANDLETYPES = 0;

    protected VmaAllocatorCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaAllocatorCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaAllocatorCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VmaAllocatorCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkPhysicalDevice")
    public long physicalDevice() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nphysicalDevice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDevice")
    public long device() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndevice(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long preferredLargeHeapBlockSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npreferredLargeHeapBlockSize(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkAllocationCallbacks const *")
    public org.lwjgl.vulkan.VkAllocationCallbacks pAllocationCallbacks() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAllocationCallbacks r0 = npAllocationCallbacks(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VmaDeviceMemoryCallbacks const *")
    public org.lwjgl.util.vma.VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = npDeviceMemoryCallbacks(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkDeviceSize const *")
    public java.nio.LongBuffer pHeapSizeLimit(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.LongBuffer r0 = npHeapSizeLimit(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("VmaVulkanFunctions const *")
    public org.lwjgl.util.vma.VmaVulkanFunctions pVulkanFunctions() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = npVulkanFunctions(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkInstance")
    public long instance() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ninstance(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int vulkanApiVersion() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvulkanApiVersion(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkExternalMemoryHandleTypeFlagsKHR const *")
    public java.nio.IntBuffer pTypeExternalMemoryHandleTypes(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            java.nio.IntBuffer r0 = npTypeExternalMemoryHandleTypes(r0, r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo flags(@org.lwjgl.system.NativeType("VmaAllocatorCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo physicalDevice(org.lwjgl.vulkan.VkPhysicalDevice r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nphysicalDevice(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo device(org.lwjgl.vulkan.VkDevice r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndevice(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo preferredLargeHeapBlockSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npreferredLargeHeapBlockSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo pAllocationCallbacks(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAllocationCallbacks const *") org.lwjgl.vulkan.VkAllocationCallbacks r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAllocationCallbacks(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo pDeviceMemoryCallbacks(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaDeviceMemoryCallbacks const *") org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDeviceMemoryCallbacks(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo pHeapSizeLimit(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npHeapSizeLimit(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo pVulkanFunctions(@org.lwjgl.system.NativeType("VmaVulkanFunctions const *") org.lwjgl.util.vma.VmaVulkanFunctions r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npVulkanFunctions(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo instance(org.lwjgl.vulkan.VkInstance r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ninstance(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo vulkanApiVersion(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nvulkanApiVersion(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypes(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkExternalMemoryHandleTypeFlagsKHR const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npTypeExternalMemoryHandleTypes(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo set(int r5, org.lwjgl.vulkan.VkPhysicalDevice r6, org.lwjgl.vulkan.VkDevice r7, long r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkAllocationCallbacks r10, @javax.annotation.Nullable org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r11, @javax.annotation.Nullable java.nio.LongBuffer r12, org.lwjgl.util.vma.VmaVulkanFunctions r13, org.lwjgl.vulkan.VkInstance r14, int r15, @javax.annotation.Nullable java.nio.IntBuffer r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.physicalDevice(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.device(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.preferredLargeHeapBlockSize(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.pAllocationCallbacks(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.pDeviceMemoryCallbacks(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.pHeapSizeLimit(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.pVulkanFunctions(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.instance(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.vulkanApiVersion(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.pTypeExternalMemoryHandleTypes(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaAllocatorCreateInfo set(org.lwjgl.util.vma.VmaAllocatorCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo malloc() {
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo calloc() {
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo create() {
            int r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo create(long r6) {
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = calloc(r0)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaAllocatorCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = new org.lwjgl.util.vma.VmaAllocatorCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nphysicalDevice(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHYSICALDEVICE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ndevice(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.DEVICE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long npreferredLargeHeapBlockSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAllocationCallbacks npAllocationCallbacks(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkAllocationCallbacks r0 = org.lwjgl.vulkan.VkAllocationCallbacks.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaDeviceMemoryCallbacks npDeviceMemoryCallbacks(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r0 = org.lwjgl.util.vma.VmaDeviceMemoryCallbacks.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.LongBuffer npHeapSizeLimit(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHEAPSIZELIMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.LongBuffer r0 = org.lwjgl.system.MemoryUtil.memLongBufferSafe(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions npVulkanFunctions(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PVULKANFUNCTIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = org.lwjgl.util.vma.VmaVulkanFunctions.create(r0)
            return r0
    }

    public static long ninstance(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.INSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nvulkanApiVersion(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.VULKANAPIVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npTypeExternalMemoryHandleTypes(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PTYPEEXTERNALMEMORYHANDLETYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r7
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nphysicalDevice(long r5, org.lwjgl.vulkan.VkPhysicalDevice r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHYSICALDEVICE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ndevice(long r5, org.lwjgl.vulkan.VkDevice r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.DEVICE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npreferredLargeHeapBlockSize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void npAllocationCallbacks(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkAllocationCallbacks r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npDeviceMemoryCallbacks(long r5, @javax.annotation.Nullable org.lwjgl.util.vma.VmaDeviceMemoryCallbacks r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npHeapSizeLimit(long r5, @javax.annotation.Nullable java.nio.LongBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHEAPSIZELIMIT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npVulkanFunctions(long r5, org.lwjgl.util.vma.VmaVulkanFunctions r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PVULKANFUNCTIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ninstance(long r5, org.lwjgl.vulkan.VkInstance r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.INSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvulkanApiVersion(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.VULKANAPIVERSION
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npTypeExternalMemoryHandleTypes(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PTYPEEXTERNALMEMORYHANDLETYPES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHYSICALDEVICE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.DEVICE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.PVULKANFUNCTIONS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.util.vma.VmaVulkanFunctions.validate(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.INSTANCE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaAllocatorCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.util.vma.VmaAllocatorCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHYSICALDEVICE = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.DEVICE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PREFERREDLARGEHEAPBLOCKSIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PALLOCATIONCALLBACKS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PDEVICEMEMORYCALLBACKS = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PHEAPSIZELIMIT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PVULKANFUNCTIONS = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.INSTANCE = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.VULKANAPIVERSION = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.PTYPEEXTERNALMEMORYHANDLETYPES = r0
            return
    }
}
