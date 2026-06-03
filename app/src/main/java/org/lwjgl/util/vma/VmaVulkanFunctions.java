package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaVulkanFunctions.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaVulkanFunctions.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaVulkanFunctions.class */
public class VmaVulkanFunctions extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaVulkanFunctions> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int VKGETINSTANCEPROCADDR = 0;
    public static final int VKGETDEVICEPROCADDR = 0;
    public static final int VKGETPHYSICALDEVICEPROPERTIES = 0;
    public static final int VKGETPHYSICALDEVICEMEMORYPROPERTIES = 0;
    public static final int VKALLOCATEMEMORY = 0;
    public static final int VKFREEMEMORY = 0;
    public static final int VKMAPMEMORY = 0;
    public static final int VKUNMAPMEMORY = 0;
    public static final int VKFLUSHMAPPEDMEMORYRANGES = 0;
    public static final int VKINVALIDATEMAPPEDMEMORYRANGES = 0;
    public static final int VKBINDBUFFERMEMORY = 0;
    public static final int VKBINDIMAGEMEMORY = 0;
    public static final int VKGETBUFFERMEMORYREQUIREMENTS = 0;
    public static final int VKGETIMAGEMEMORYREQUIREMENTS = 0;
    public static final int VKCREATEBUFFER = 0;
    public static final int VKDESTROYBUFFER = 0;
    public static final int VKCREATEIMAGE = 0;
    public static final int VKDESTROYIMAGE = 0;
    public static final int VKCMDCOPYBUFFER = 0;
    public static final int VKGETBUFFERMEMORYREQUIREMENTS2KHR = 0;
    public static final int VKGETIMAGEMEMORYREQUIREMENTS2KHR = 0;
    public static final int VKBINDBUFFERMEMORY2KHR = 0;
    public static final int VKBINDIMAGEMEMORY2KHR = 0;
    public static final int VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR = 0;
    public static final int VKGETDEVICEBUFFERMEMORYREQUIREMENTS = 0;
    public static final int VKGETDEVICEIMAGEMEMORYREQUIREMENTS = 0;

    protected VmaVulkanFunctions(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaVulkanFunctions create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaVulkanFunctions(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetInstanceProcAddr")
    public long vkGetInstanceProcAddr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetInstanceProcAddr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetDeviceProcAddr")
    public long vkGetDeviceProcAddr() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetDeviceProcAddr(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetPhysicalDeviceProperties")
    public long vkGetPhysicalDeviceProperties() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetPhysicalDeviceProperties(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetPhysicalDeviceMemoryProperties")
    public long vkGetPhysicalDeviceMemoryProperties() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetPhysicalDeviceMemoryProperties(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkAllocateMemory")
    public long vkAllocateMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkAllocateMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkFreeMemory")
    public long vkFreeMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkFreeMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkMapMemory")
    public long vkMapMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkMapMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkUnmapMemory")
    public long vkUnmapMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkUnmapMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkFlushMappedMemoryRanges")
    public long vkFlushMappedMemoryRanges() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkFlushMappedMemoryRanges(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkInvalidateMappedMemoryRanges")
    public long vkInvalidateMappedMemoryRanges() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkInvalidateMappedMemoryRanges(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkBindBufferMemory")
    public long vkBindBufferMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkBindBufferMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkBindImageMemory")
    public long vkBindImageMemory() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkBindImageMemory(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetBufferMemoryRequirements")
    public long vkGetBufferMemoryRequirements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetBufferMemoryRequirements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetImageMemoryRequirements")
    public long vkGetImageMemoryRequirements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetImageMemoryRequirements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkCreateBuffer")
    public long vkCreateBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkCreateBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkDestroyBuffer")
    public long vkDestroyBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkDestroyBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkCreateImage")
    public long vkCreateImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkCreateImage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkDestroyImage")
    public long vkDestroyImage() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkDestroyImage(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkCmdCopyBuffer")
    public long vkCmdCopyBuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkCmdCopyBuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetBufferMemoryRequirements2KHR")
    public long vkGetBufferMemoryRequirements2KHR() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetBufferMemoryRequirements2KHR(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetImageMemoryRequirements2KHR")
    public long vkGetImageMemoryRequirements2KHR() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetImageMemoryRequirements2KHR(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkBindBufferMemory2KHR")
    public long vkBindBufferMemory2KHR() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkBindBufferMemory2KHR(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkBindImageMemory2KHR")
    public long vkBindImageMemory2KHR() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkBindImageMemory2KHR(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetPhysicalDeviceMemoryProperties2KHR")
    public long vkGetPhysicalDeviceMemoryProperties2KHR() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetPhysicalDeviceMemoryProperties2KHR(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetDeviceBufferMemoryRequirements")
    public long vkGetDeviceBufferMemoryRequirements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetDeviceBufferMemoryRequirements(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("PFN_vkGetDeviceImageMemoryRequirements")
    public long vkGetDeviceImageMemoryRequirements() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nvkGetDeviceImageMemoryRequirements(r0)
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetInstanceProcAddr(@org.lwjgl.system.NativeType("PFN_vkGetInstanceProcAddr") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetInstanceProcAddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetDeviceProcAddr(@org.lwjgl.system.NativeType("PFN_vkGetDeviceProcAddr") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetDeviceProcAddr(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetPhysicalDeviceProperties(@org.lwjgl.system.NativeType("PFN_vkGetPhysicalDeviceProperties") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetPhysicalDeviceProperties(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties(@org.lwjgl.system.NativeType("PFN_vkGetPhysicalDeviceMemoryProperties") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetPhysicalDeviceMemoryProperties(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkAllocateMemory(@org.lwjgl.system.NativeType("PFN_vkAllocateMemory") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkAllocateMemory(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkFreeMemory(@org.lwjgl.system.NativeType("PFN_vkFreeMemory") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkFreeMemory(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkMapMemory(@org.lwjgl.system.NativeType("PFN_vkMapMemory") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkMapMemory(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkUnmapMemory(@org.lwjgl.system.NativeType("PFN_vkUnmapMemory") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkUnmapMemory(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkFlushMappedMemoryRanges(@org.lwjgl.system.NativeType("PFN_vkFlushMappedMemoryRanges") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkFlushMappedMemoryRanges(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkInvalidateMappedMemoryRanges(@org.lwjgl.system.NativeType("PFN_vkInvalidateMappedMemoryRanges") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkInvalidateMappedMemoryRanges(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkBindBufferMemory(@org.lwjgl.system.NativeType("PFN_vkBindBufferMemory") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkBindBufferMemory(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkBindImageMemory(@org.lwjgl.system.NativeType("PFN_vkBindImageMemory") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkBindImageMemory(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetBufferMemoryRequirements(@org.lwjgl.system.NativeType("PFN_vkGetBufferMemoryRequirements") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetBufferMemoryRequirements(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetImageMemoryRequirements(@org.lwjgl.system.NativeType("PFN_vkGetImageMemoryRequirements") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetImageMemoryRequirements(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkCreateBuffer(@org.lwjgl.system.NativeType("PFN_vkCreateBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkCreateBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkDestroyBuffer(@org.lwjgl.system.NativeType("PFN_vkDestroyBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkDestroyBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkCreateImage(@org.lwjgl.system.NativeType("PFN_vkCreateImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkCreateImage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkDestroyImage(@org.lwjgl.system.NativeType("PFN_vkDestroyImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkDestroyImage(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkCmdCopyBuffer(@org.lwjgl.system.NativeType("PFN_vkCmdCopyBuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkCmdCopyBuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetBufferMemoryRequirements2KHR(@org.lwjgl.system.NativeType("PFN_vkGetBufferMemoryRequirements2KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetBufferMemoryRequirements2KHR(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetImageMemoryRequirements2KHR(@org.lwjgl.system.NativeType("PFN_vkGetImageMemoryRequirements2KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetImageMemoryRequirements2KHR(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkBindBufferMemory2KHR(@org.lwjgl.system.NativeType("PFN_vkBindBufferMemory2KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkBindBufferMemory2KHR(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkBindImageMemory2KHR(@org.lwjgl.system.NativeType("PFN_vkBindImageMemory2KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkBindImageMemory2KHR(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetPhysicalDeviceMemoryProperties2KHR(@org.lwjgl.system.NativeType("PFN_vkGetPhysicalDeviceMemoryProperties2KHR") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetPhysicalDeviceMemoryProperties2KHR(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetDeviceBufferMemoryRequirements(@org.lwjgl.system.NativeType("PFN_vkGetDeviceBufferMemoryRequirements") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetDeviceBufferMemoryRequirements(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions vkGetDeviceImageMemoryRequirements(@org.lwjgl.system.NativeType("PFN_vkGetDeviceImageMemoryRequirements") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nvkGetDeviceImageMemoryRequirements(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions set(long r5, long r7, long r9, long r11, long r13, long r15, long r17, long r19, long r21, long r23, long r25, long r27, long r29, long r31, long r33, long r35, long r37, long r39, long r41, long r43, long r45, long r47, long r49, long r51, long r53, long r55) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetInstanceProcAddr(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetDeviceProcAddr(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetPhysicalDeviceProperties(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetPhysicalDeviceMemoryProperties(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkAllocateMemory(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkFreeMemory(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkMapMemory(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkUnmapMemory(r1)
            r0 = r4
            r1 = r21
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkFlushMappedMemoryRanges(r1)
            r0 = r4
            r1 = r23
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkInvalidateMappedMemoryRanges(r1)
            r0 = r4
            r1 = r25
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindBufferMemory(r1)
            r0 = r4
            r1 = r27
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindImageMemory(r1)
            r0 = r4
            r1 = r29
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetBufferMemoryRequirements(r1)
            r0 = r4
            r1 = r31
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetImageMemoryRequirements(r1)
            r0 = r4
            r1 = r33
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkCreateBuffer(r1)
            r0 = r4
            r1 = r35
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkDestroyBuffer(r1)
            r0 = r4
            r1 = r37
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkCreateImage(r1)
            r0 = r4
            r1 = r39
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkDestroyImage(r1)
            r0 = r4
            r1 = r41
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkCmdCopyBuffer(r1)
            r0 = r4
            r1 = r43
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetBufferMemoryRequirements2KHR(r1)
            r0 = r4
            r1 = r45
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetImageMemoryRequirements2KHR(r1)
            r0 = r4
            r1 = r47
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindBufferMemory2KHR(r1)
            r0 = r4
            r1 = r49
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindImageMemory2KHR(r1)
            r0 = r4
            r1 = r51
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetPhysicalDeviceMemoryProperties2KHR(r1)
            r0 = r4
            r1 = r53
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetDeviceBufferMemoryRequirements(r1)
            r0 = r4
            r1 = r55
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetDeviceImageMemoryRequirements(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions set(org.lwjgl.util.vma.VmaVulkanFunctions r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions malloc() {
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions calloc() {
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions create() {
            int r0 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions create(long r6) {
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaVulkanFunctions createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaVulkanFunctions mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaVulkanFunctions callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaVulkanFunctions mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaVulkanFunctions callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = calloc(r0)
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaVulkanFunctions calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = new org.lwjgl.util.vma.VmaVulkanFunctions
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static long nvkGetInstanceProcAddr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETINSTANCEPROCADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetDeviceProcAddr(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEPROCADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetPhysicalDeviceProperties(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetPhysicalDeviceMemoryProperties(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkAllocateMemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKALLOCATEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkFreeMemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKFREEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkMapMemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKMAPMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkUnmapMemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKUNMAPMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkFlushMappedMemoryRanges(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkInvalidateMappedMemoryRanges(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkBindBufferMemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkBindImageMemory(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetBufferMemoryRequirements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetImageMemoryRequirements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkCreateBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkDestroyBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkCreateImage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkDestroyImage(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkCmdCopyBuffer(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCMDCOPYBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetBufferMemoryRequirements2KHR(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetImageMemoryRequirements2KHR(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkBindBufferMemory2KHR(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkBindImageMemory2KHR(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetPhysicalDeviceMemoryProperties2KHR(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetDeviceBufferMemoryRequirements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEBUFFERMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nvkGetDeviceImageMemoryRequirements(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEIMAGEMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nvkGetInstanceProcAddr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETINSTANCEPROCADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetDeviceProcAddr(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEPROCADDR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceProperties(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceMemoryProperties(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkAllocateMemory(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKALLOCATEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkFreeMemory(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKFREEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkMapMemory(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKMAPMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkUnmapMemory(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKUNMAPMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkFlushMappedMemoryRanges(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkInvalidateMappedMemoryRanges(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkBindBufferMemory(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkBindImageMemory(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetBufferMemoryRequirements(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetImageMemoryRequirements(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkCreateBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkDestroyBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkCreateImage(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkDestroyImage(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkCmdCopyBuffer(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCMDCOPYBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.Checks.check(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetBufferMemoryRequirements2KHR(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetImageMemoryRequirements2KHR(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkBindBufferMemory2KHR(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkBindImageMemory2KHR(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetPhysicalDeviceMemoryProperties2KHR(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetDeviceBufferMemoryRequirements(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEBUFFERMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvkGetDeviceImageMemoryRequirements(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEIMAGEMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKALLOCATEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKFREEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKMAPMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKUNMAPMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYIMAGE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaVulkanFunctions.VKCMDCOPYBUFFER
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    public org.lwjgl.util.vma.VmaVulkanFunctions set(org.lwjgl.vulkan.VkInstance r7, org.lwjgl.vulkan.VkDevice r8) {
            r6 = this;
            r0 = r7
            org.lwjgl.vulkan.VKCapabilitiesInstance r0 = r0.getCapabilities()
            r9 = r0
            r0 = r8
            org.lwjgl.vulkan.VKCapabilitiesDevice r0 = r0.getCapabilities()
            r10 = r0
            r0 = r6
            r1 = 0
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetInstanceProcAddr(r1)
            r1 = 0
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetDeviceProcAddr(r1)
            r1 = r9
            long r1 = r1.vkGetPhysicalDeviceProperties
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetPhysicalDeviceProperties(r1)
            r1 = r9
            long r1 = r1.vkGetPhysicalDeviceMemoryProperties
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetPhysicalDeviceMemoryProperties(r1)
            r1 = r10
            long r1 = r1.vkAllocateMemory
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkAllocateMemory(r1)
            r1 = r10
            long r1 = r1.vkFreeMemory
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkFreeMemory(r1)
            r1 = r10
            long r1 = r1.vkMapMemory
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkMapMemory(r1)
            r1 = r10
            long r1 = r1.vkUnmapMemory
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkUnmapMemory(r1)
            r1 = r10
            long r1 = r1.vkFlushMappedMemoryRanges
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkFlushMappedMemoryRanges(r1)
            r1 = r10
            long r1 = r1.vkInvalidateMappedMemoryRanges
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkInvalidateMappedMemoryRanges(r1)
            r1 = r10
            long r1 = r1.vkBindBufferMemory
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindBufferMemory(r1)
            r1 = r10
            long r1 = r1.vkBindImageMemory
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindImageMemory(r1)
            r1 = r10
            long r1 = r1.vkGetBufferMemoryRequirements
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetBufferMemoryRequirements(r1)
            r1 = r10
            long r1 = r1.vkGetImageMemoryRequirements
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetImageMemoryRequirements(r1)
            r1 = r10
            long r1 = r1.vkCreateBuffer
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkCreateBuffer(r1)
            r1 = r10
            long r1 = r1.vkDestroyBuffer
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkDestroyBuffer(r1)
            r1 = r10
            long r1 = r1.vkCreateImage
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkCreateImage(r1)
            r1 = r10
            long r1 = r1.vkDestroyImage
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkDestroyImage(r1)
            r1 = r10
            long r1 = r1.vkCmdCopyBuffer
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkCmdCopyBuffer(r1)
            r1 = r10
            long r1 = r1.vkGetBufferMemoryRequirements2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Lac
            r1 = r10
            long r1 = r1.vkGetBufferMemoryRequirements2
            goto Lb1
        Lac:
            r1 = r10
            long r1 = r1.vkGetBufferMemoryRequirements2KHR
        Lb1:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetBufferMemoryRequirements2KHR(r1)
            r1 = r10
            long r1 = r1.vkGetImageMemoryRequirements2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Lc6
            r1 = r10
            long r1 = r1.vkGetImageMemoryRequirements2
            goto Lcb
        Lc6:
            r1 = r10
            long r1 = r1.vkGetImageMemoryRequirements2KHR
        Lcb:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetImageMemoryRequirements2KHR(r1)
            r1 = r10
            long r1 = r1.vkBindBufferMemory2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Le0
            r1 = r10
            long r1 = r1.vkBindBufferMemory2
            goto Le5
        Le0:
            r1 = r10
            long r1 = r1.vkBindBufferMemory2KHR
        Le5:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindBufferMemory2KHR(r1)
            r1 = r10
            long r1 = r1.vkBindImageMemory2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto Lfa
            r1 = r10
            long r1 = r1.vkBindImageMemory2
            goto Lff
        Lfa:
            r1 = r10
            long r1 = r1.vkBindImageMemory2KHR
        Lff:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkBindImageMemory2KHR(r1)
            r1 = r9
            long r1 = r1.vkGetPhysicalDeviceMemoryProperties2
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L112
            r1 = r9
            long r1 = r1.vkGetPhysicalDeviceMemoryProperties2
            goto L116
        L112:
            r1 = r9
            long r1 = r1.vkGetPhysicalDeviceMemoryProperties2KHR
        L116:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetPhysicalDeviceMemoryProperties2KHR(r1)
            r1 = r10
            long r1 = r1.vkGetDeviceBufferMemoryRequirements
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L12b
            r1 = r10
            long r1 = r1.vkGetDeviceBufferMemoryRequirements
            goto L130
        L12b:
            r1 = r10
            long r1 = r1.vkGetDeviceBufferMemoryRequirementsKHR
        L130:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetDeviceBufferMemoryRequirements(r1)
            r1 = r10
            long r1 = r1.vkGetDeviceImageMemoryRequirements
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L145
            r1 = r10
            long r1 = r1.vkGetDeviceImageMemoryRequirements
            goto L14a
        L145:
            r1 = r10
            long r1 = r1.vkGetDeviceImageMemoryRequirementsKHR
        L14a:
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.vkGetDeviceImageMemoryRequirements(r1)
            r0 = r6
            return r0
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.util.vma.VmaVulkanFunctions r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 26
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 11
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 12
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 13
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 14
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 15
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 16
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 17
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 18
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 19
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 20
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 21
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 22
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 23
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 24
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 25
            int r3 = org.lwjgl.util.vma.VmaVulkanFunctions.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaVulkanFunctions.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaVulkanFunctions.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETINSTANCEPROCADDR = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEPROCADDR = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEPROPERTIES = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKALLOCATEMEMORY = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKFREEMEMORY = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKMAPMEMORY = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKUNMAPMEMORY = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKFLUSHMAPPEDMEMORYRANGES = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKINVALIDATEMAPPEDMEMORYRANGES = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY = r0
            r0 = r5
            r1 = 11
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY = r0
            r0 = r5
            r1 = 12
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS = r0
            r0 = r5
            r1 = 13
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS = r0
            r0 = r5
            r1 = 14
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEBUFFER = r0
            r0 = r5
            r1 = 15
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYBUFFER = r0
            r0 = r5
            r1 = 16
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKCREATEIMAGE = r0
            r0 = r5
            r1 = 17
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKDESTROYIMAGE = r0
            r0 = r5
            r1 = 18
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKCMDCOPYBUFFER = r0
            r0 = r5
            r1 = 19
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETBUFFERMEMORYREQUIREMENTS2KHR = r0
            r0 = r5
            r1 = 20
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETIMAGEMEMORYREQUIREMENTS2KHR = r0
            r0 = r5
            r1 = 21
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDBUFFERMEMORY2KHR = r0
            r0 = r5
            r1 = 22
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKBINDIMAGEMEMORY2KHR = r0
            r0 = r5
            r1 = 23
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETPHYSICALDEVICEMEMORYPROPERTIES2KHR = r0
            r0 = r5
            r1 = 24
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEBUFFERMEMORYREQUIREMENTS = r0
            r0 = r5
            r1 = 25
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaVulkanFunctions.VKGETDEVICEIMAGEMEMORYREQUIREMENTS = r0
            return
    }
}
