package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/Vma.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/Vma.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/Vma.class */
public class Vma {
    public static final int VMA_ALLOCATOR_CREATE_EXTERNALLY_SYNCHRONIZED_BIT = 1;
    public static final int VMA_ALLOCATOR_CREATE_KHR_DEDICATED_ALLOCATION_BIT = 2;
    public static final int VMA_ALLOCATOR_CREATE_KHR_BIND_MEMORY2_BIT = 4;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_BUDGET_BIT = 8;
    public static final int VMA_ALLOCATOR_CREATE_AMD_DEVICE_COHERENT_MEMORY_BIT = 16;
    public static final int VMA_ALLOCATOR_CREATE_BUFFER_DEVICE_ADDRESS_BIT = 32;
    public static final int VMA_ALLOCATOR_CREATE_EXT_MEMORY_PRIORITY_BIT = 64;
    public static final int VMA_MEMORY_USAGE_UNKNOWN = 0;
    public static final int VMA_MEMORY_USAGE_GPU_ONLY = 1;
    public static final int VMA_MEMORY_USAGE_CPU_ONLY = 2;
    public static final int VMA_MEMORY_USAGE_CPU_TO_GPU = 3;
    public static final int VMA_MEMORY_USAGE_GPU_TO_CPU = 4;
    public static final int VMA_MEMORY_USAGE_CPU_COPY = 5;
    public static final int VMA_MEMORY_USAGE_GPU_LAZILY_ALLOCATED = 6;
    public static final int VMA_MEMORY_USAGE_AUTO = 7;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_DEVICE = 8;
    public static final int VMA_MEMORY_USAGE_AUTO_PREFER_HOST = 9;
    public static final int VMA_ALLOCATION_CREATE_DEDICATED_MEMORY_BIT = 1;
    public static final int VMA_ALLOCATION_CREATE_NEVER_ALLOCATE_BIT = 2;
    public static final int VMA_ALLOCATION_CREATE_MAPPED_BIT = 4;
    public static final int VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT = 32;
    public static final int VMA_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    public static final int VMA_ALLOCATION_CREATE_DONT_BIND_BIT = 128;
    public static final int VMA_ALLOCATION_CREATE_WITHIN_BUDGET_BIT = 256;
    public static final int VMA_ALLOCATION_CREATE_CAN_ALIAS_BIT = 512;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_SEQUENTIAL_WRITE_BIT = 1024;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_RANDOM_BIT = 2048;
    public static final int VMA_ALLOCATION_CREATE_HOST_ACCESS_ALLOW_TRANSFER_INSTEAD_BIT = 4096;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_BEST_FIT_BIT = 65536;
    public static final int VMA_VMA_ALLOCATION_CREATE_STRATEGY_FIRST_FIT_BIT = 131072;
    public static final int VMA_ALLOCATION_CREATE_STRATEGY_MASK = 458752;
    public static final int VMA_POOL_CREATE_IGNORE_BUFFER_IMAGE_GRANULARITY_BIT = 2;
    public static final int VMA_POOL_CREATE_LINEAR_ALGORITHM_BIT = 4;
    public static final int VMA_POOL_CREATE_ALGORITHM_MASK = 4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FAST_BIT = 1;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_BALANCED_BIT = 2;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_FULL_BIT = 4;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_EXTENSIVE_BIT = 8;
    public static final int VMA_DEFRAGMENTATION_FLAG_ALGORITHM_MASK = 15;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_COPY = 0;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_IGNORE = 1;
    public static final int VMA_DEFRAGMENTATION_MOVE_OPERATION_DESTROY = 2;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_LINEAR_ALGORITHM_BIT = 1;
    public static final int VMA_VIRTUAL_BLOCK_CREATE_ALGORITHM_MASK = 1;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_UPPER_ADDRESS_BIT = 64;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_MEMORY_BIT = 65536;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_TIME_BIT = 131072;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MIN_OFFSET_BIT = 262144;
    public static final int VMA_VIRTUAL_ALLOCATION_CREATE_STRATEGY_MASK = 458752;

    protected Vma() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nvmaCreateAllocator(long r0, long r2);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateAllocator(@org.lwjgl.system.NativeType("VmaAllocatorCreateInfo const *") org.lwjgl.util.vma.VmaAllocatorCreateInfo r5, @org.lwjgl.system.NativeType("VmaAllocator *") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r5
            long r0 = r0.address()
            org.lwjgl.util.vma.VmaAllocatorCreateInfo.validate(r0)
        L12:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nvmaCreateAllocator(r0, r1)
            return r0
    }

    public static native void nvmaDestroyAllocator(long r0);

    public static void vmaDestroyAllocator(@org.lwjgl.system.NativeType("VmaAllocator") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nvmaDestroyAllocator(r0)
            return
    }

    public static native void nvmaGetAllocatorInfo(long r0, long r2);

    public static void vmaGetAllocatorInfo(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaAllocatorInfo *") org.lwjgl.util.vma.VmaAllocatorInfo r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nvmaGetAllocatorInfo(r0, r1)
            return
    }

    public static native void nvmaGetPhysicalDeviceProperties(long r0, long r2);

    public static void vmaGetPhysicalDeviceProperties(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VkPhysicalDeviceProperties const **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nvmaGetPhysicalDeviceProperties(r0, r1)
            return
    }

    public static native void nvmaGetMemoryProperties(long r0, long r2);

    public static void vmaGetMemoryProperties(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VkPhysicalDeviceMemoryProperties const **") org.lwjgl.PointerBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nvmaGetMemoryProperties(r0, r1)
            return
    }

    public static native void nvmaGetMemoryTypeProperties(long r0, int r2, long r3);

    public static void vmaGetMemoryTypeProperties(@org.lwjgl.system.NativeType("VmaAllocator") long r6, @org.lwjgl.system.NativeType("uint32_t") int r8, @org.lwjgl.system.NativeType("VkMemoryPropertyFlags *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvmaGetMemoryTypeProperties(r0, r1, r2)
            return
    }

    public static native void nvmaSetCurrentFrameIndex(long r0, int r2);

    public static void vmaSetCurrentFrameIndex(@org.lwjgl.system.NativeType("VmaAllocator") long r4, @org.lwjgl.system.NativeType("uint32_t") int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            nvmaSetCurrentFrameIndex(r0, r1)
            return
    }

    public static native void nvmaCalculateStatistics(long r0, long r2);

    public static void vmaCalculateStatistics(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaTotalStatistics *") org.lwjgl.util.vma.VmaTotalStatistics r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nvmaCalculateStatistics(r0, r1)
            return
    }

    public static native void nvmaGetHeapBudgets(long r0, long r2);

    public static void vmaGetHeapBudgets(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaBudget *") org.lwjgl.util.vma.VmaBudget.Buffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nvmaGetHeapBudgets(r0, r1)
            return
    }

    public static native int nvmaFindMemoryTypeIndex(long r0, int r2, long r3, long r5);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaFindMemoryTypeIndex(@org.lwjgl.system.NativeType("VmaAllocator") long r8, @org.lwjgl.system.NativeType("uint32_t") int r10, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r11, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = r2.address()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvmaFindMemoryTypeIndex(r0, r1, r2, r3)
            return r0
    }

    public static native int nvmaFindMemoryTypeIndexForBufferInfo(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForBufferInfo(@org.lwjgl.system.NativeType("VmaAllocator") long r9, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r11, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r12, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvmaFindMemoryTypeIndexForBufferInfo(r0, r1, r2, r3)
            return r0
    }

    public static native int nvmaFindMemoryTypeIndexForImageInfo(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaFindMemoryTypeIndexForImageInfo(@org.lwjgl.system.NativeType("VmaAllocator") long r9, @org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r11, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r12, @org.lwjgl.system.NativeType("uint32_t *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = r2.address()
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvmaFindMemoryTypeIndexForImageInfo(r0, r1, r2, r3)
            return r0
    }

    public static native int nvmaCreatePool(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreatePool(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaPoolCreateInfo const *") org.lwjgl.util.vma.VmaPoolCreateInfo r9, @org.lwjgl.system.NativeType("VmaPool *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvmaCreatePool(r0, r1, r2)
            return r0
    }

    public static native void nvmaDestroyPool(long r0, long r2);

    public static void vmaDestroyPool(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaPool") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r5
            r1 = r7
            nvmaDestroyPool(r0, r1)
            return
    }

    public static native void nvmaGetPoolStatistics(long r0, long r2, long r4);

    public static void vmaGetPoolStatistics(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaPool") long r9, @org.lwjgl.system.NativeType("VmaStatistics *") org.lwjgl.util.vma.VmaStatistics r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            nvmaGetPoolStatistics(r0, r1, r2)
            return
    }

    public static native void nvmaCalculatePoolStatistics(long r0, long r2, long r4);

    public static void vmaCalculatePoolStatistics(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaPool") long r9, @org.lwjgl.system.NativeType("VmaDetailedStatistics *") org.lwjgl.util.vma.VmaDetailedStatistics r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            nvmaCalculatePoolStatistics(r0, r1, r2)
            return
    }

    public static native int nvmaCheckPoolCorruption(long r0, long r2);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCheckPoolCorruption(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaPool") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r5
            r1 = r7
            int r0 = nvmaCheckPoolCorruption(r0, r1)
            return r0
    }

    public static native void nvmaGetPoolName(long r0, long r2, long r4);

    public static void vmaGetPoolName(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaPool") long r9, @org.lwjgl.system.NativeType("char const **") org.lwjgl.PointerBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvmaGetPoolName(r0, r1, r2)
            return
    }

    public static native void nvmaSetPoolName(long r0, long r2, long r4);

    public static void vmaSetPoolName(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaPool") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvmaSetPoolName(r0, r1, r2)
            return
    }

    public static void vmaSetPoolName(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaPool") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = 1
            int r0 = r0.nASCIISafe(r1, r2)     // Catch: java.lang.Throwable -> L46
            r0 = r11
            if (r0 != 0) goto L2e
            r0 = 0
            goto L33
        L2e:
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L46
        L33:
            r14 = r0
            r0 = r7
            r1 = r9
            r2 = r14
            nvmaSetPoolName(r0, r1, r2)     // Catch: java.lang.Throwable -> L46
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L52
        L46:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L52:
            return
    }

    public static native int nvmaAllocateMemory(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaAllocateMemory(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VkMemoryRequirements const *") org.lwjgl.vulkan.VkMemoryRequirements r13, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r14, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r11
            r1 = r13
            long r1 = r1.address()
            r2 = r14
            long r2 = r2.address()
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvmaAllocateMemory(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nvmaAllocateMemoryPages(long r0, long r2, long r4, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaAllocateMemoryPages(@org.lwjgl.system.NativeType("VmaAllocator") long r13, @org.lwjgl.system.NativeType("VkMemoryRequirements const *") org.lwjgl.vulkan.VkMemoryRequirements r15, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r16, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo.Buffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = r17
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r13
            r1 = r15
            long r1 = r1.address()
            r2 = r16
            long r2 = r2.address()
            r3 = r17
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r18
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nvmaAllocateMemoryPages(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native int nvmaAllocateMemoryForBuffer(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaAllocateMemoryForBuffer(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VkBuffer") long r13, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r15, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r11
            r1 = r13
            r2 = r15
            long r2 = r2.address()
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvmaAllocateMemoryForBuffer(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nvmaAllocateMemoryForImage(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaAllocateMemoryForImage(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VkImage") long r13, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r15, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r16, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r11
            r1 = r13
            r2 = r15
            long r2 = r2.address()
            r3 = r16
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r17
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvmaAllocateMemoryForImage(r0, r1, r2, r3, r4)
            return r0
    }

    public static native void nvmaFreeMemory(long r0, long r2);

    public static void vmaFreeMemory(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaAllocation const") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            nvmaFreeMemory(r0, r1)
            return
    }

    public static native void nvmaFreeMemoryPages(long r0, long r2, long r4);

    public static void vmaFreeMemoryPages(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation const *") org.lwjgl.PointerBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvmaFreeMemoryPages(r0, r1, r2)
            return
    }

    public static native void nvmaGetAllocationInfo(long r0, long r2, long r4);

    public static void vmaGetAllocationInfo(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            nvmaGetAllocationInfo(r0, r1, r2)
            return
    }

    public static native void nvmaSetAllocationUserData(long r0, long r2, long r4);

    public static void vmaSetAllocationUserData(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @org.lwjgl.system.NativeType("void *") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            nvmaSetAllocationUserData(r0, r1, r2)
            return
    }

    public static native void nvmaSetAllocationName(long r0, long r2, long r4);

    public static void vmaSetAllocationName(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L15
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            org.lwjgl.system.Checks.checkNT1Safe(r0)
        L15:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvmaSetAllocationName(r0, r1, r2)
            return
    }

    public static void vmaSetAllocationName(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("char const *") java.lang.CharSequence r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = r11
            r2 = 1
            int r0 = r0.nUTF8Safe(r1, r2)     // Catch: java.lang.Throwable -> L46
            r0 = r11
            if (r0 != 0) goto L2e
            r0 = 0
            goto L33
        L2e:
            r0 = r12
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L46
        L33:
            r14 = r0
            r0 = r7
            r1 = r9
            r2 = r14
            nvmaSetAllocationName(r0, r1, r2)     // Catch: java.lang.Throwable -> L46
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            goto L52
        L46:
            r16 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r16
            throw r0
        L52:
            return
    }

    public static native void nvmaGetAllocationMemoryProperties(long r0, long r2, long r4);

    public static void vmaGetAllocationMemoryProperties(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @org.lwjgl.system.NativeType("VkMemoryPropertyFlags *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nvmaGetAllocationMemoryProperties(r0, r1, r2)
            return
    }

    public static native int nvmaMapMemory(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaMapMemory(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvmaMapMemory(r0, r1, r2)
            return r0
    }

    public static native void nvmaUnmapMemory(long r0, long r2);

    public static void vmaUnmapMemory(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("VmaAllocation") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r5
            r1 = r7
            nvmaUnmapMemory(r0, r1)
            return
    }

    public static native void nvmaFlushAllocation(long r0, long r2, long r4, long r6);

    public static void vmaFlushAllocation(@org.lwjgl.system.NativeType("VmaAllocator") long r9, @org.lwjgl.system.NativeType("VmaAllocation") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            nvmaFlushAllocation(r0, r1, r2, r3)
            return
    }

    public static native void nvmaInvalidateAllocation(long r0, long r2, long r4, long r6);

    public static void vmaInvalidateAllocation(@org.lwjgl.system.NativeType("VmaAllocator") long r9, @org.lwjgl.system.NativeType("VmaAllocation") long r11, @org.lwjgl.system.NativeType("VkDeviceSize") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            nvmaInvalidateAllocation(r0, r1, r2, r3)
            return
    }

    public static native int nvmaFlushAllocations(long r0, int r2, long r3, long r5, long r7);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaFlushAllocations(@org.lwjgl.system.NativeType("VmaAllocator") long r10, @org.lwjgl.system.NativeType("VmaAllocation const *") org.lwjgl.PointerBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r10
            r1 = r12
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvmaFlushAllocations(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nvmaInvalidateAllocations(long r0, int r2, long r3, long r5, long r7);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaInvalidateAllocations(@org.lwjgl.system.NativeType("VmaAllocator") long r10, @org.lwjgl.system.NativeType("VmaAllocation const *") org.lwjgl.PointerBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize const *") java.nio.LongBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            r0 = r10
            r1 = r12
            int r1 = r1.remaining()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            int r0 = nvmaInvalidateAllocations(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nvmaCheckCorruption(long r0, int r2);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCheckCorruption(@org.lwjgl.system.NativeType("VmaAllocator") long r4, @org.lwjgl.system.NativeType("uint32_t") int r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r4
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r4
            r1 = r6
            int r0 = nvmaCheckCorruption(r0, r1)
            return r0
    }

    public static native int nvmaBeginDefragmentation(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaBeginDefragmentation(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaDefragmentationInfo const *") org.lwjgl.util.vma.VmaDefragmentationInfo r9, @org.lwjgl.system.NativeType("VmaDefragmentationContext *") org.lwjgl.PointerBuffer r10) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r7
            r1 = r9
            long r1 = r1.address()
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nvmaBeginDefragmentation(r0, r1, r2)
            return r0
    }

    public static native void nvmaEndDefragmentation(long r0, long r2, long r4);

    public static void vmaEndDefragmentation(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaDefragmentationContext") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaDefragmentationStats *") org.lwjgl.util.vma.VmaDefragmentationStats r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nvmaEndDefragmentation(r0, r1, r2)
            return
    }

    public static native int nvmaBeginDefragmentationPass(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaBeginDefragmentationPass(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaDefragmentationContext") long r9, @org.lwjgl.system.NativeType("VmaDefragmentationPassMoveInfo *") org.lwjgl.util.vma.VmaDefragmentationPassMoveInfo r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            int r0 = nvmaBeginDefragmentationPass(r0, r1, r2)
            return r0
    }

    public static native int nvmaEndDefragmentationPass(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaEndDefragmentationPass(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaDefragmentationContext") long r9, @org.lwjgl.system.NativeType("VmaDefragmentationPassMoveInfo *") org.lwjgl.util.vma.VmaDefragmentationPassMoveInfo r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            int r0 = nvmaEndDefragmentationPass(r0, r1, r2)
            return r0
    }

    public static native int nvmaBindBufferMemory(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaBindBufferMemory(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @org.lwjgl.system.NativeType("VkBuffer") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nvmaBindBufferMemory(r0, r1, r2)
            return r0
    }

    public static native int nvmaBindBufferMemory2(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaBindBufferMemory2(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VmaAllocation") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkBuffer") long r17, @org.lwjgl.system.NativeType("void const *") long r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = nvmaBindBufferMemory2(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nvmaBindImageMemory(long r0, long r2, long r4);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaBindImageMemory(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VmaAllocation") long r9, @org.lwjgl.system.NativeType("VkImage") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = nvmaBindImageMemory(r0, r1, r2)
            return r0
    }

    public static native int nvmaBindImageMemory2(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaBindImageMemory2(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VmaAllocation") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkImage") long r17, @org.lwjgl.system.NativeType("void const *") long r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = nvmaBindImageMemory2(r0, r1, r2, r3, r4)
            return r0
    }

    public static native int nvmaCreateBuffer(long r0, long r2, long r4, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateBuffer(@org.lwjgl.system.NativeType("VmaAllocator") long r13, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r15, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r16, @org.lwjgl.system.NativeType("VkBuffer *") java.nio.LongBuffer r17, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r13
            r1 = r15
            long r1 = r1.address()
            r2 = r16
            long r2 = r2.address()
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nvmaCreateBuffer(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native int nvmaCreateBufferWithAlignment(long r0, long r2, long r4, long r6, long r8, long r10, long r12);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateBufferWithAlignment(@org.lwjgl.system.NativeType("VmaAllocator") long r15, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r17, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r18, @org.lwjgl.system.NativeType("VkDeviceSize") long r19, @org.lwjgl.system.NativeType("VkBuffer *") java.nio.LongBuffer r21, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r23) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r21
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r22
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r15
            r1 = r17
            long r1 = r1.address()
            r2 = r18
            long r2 = r2.address()
            r3 = r19
            r4 = r21
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r22
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r23
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            int r0 = nvmaCreateBufferWithAlignment(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static native int nvmaCreateAliasingBuffer(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateAliasingBuffer(@org.lwjgl.system.NativeType("VmaAllocator") long r9, @org.lwjgl.system.NativeType("VmaAllocation") long r11, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r13, @org.lwjgl.system.NativeType("VkBuffer *") java.nio.LongBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvmaCreateAliasingBuffer(r0, r1, r2, r3)
            return r0
    }

    public static native int nvmaCreateAliasingBuffer2(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateAliasingBuffer2(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VmaAllocation") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkBufferCreateInfo const *") org.lwjgl.vulkan.VkBufferCreateInfo r17, @org.lwjgl.system.NativeType("VkBuffer *") java.nio.LongBuffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            long r3 = r3.address()
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvmaCreateAliasingBuffer2(r0, r1, r2, r3, r4)
            return r0
    }

    public static native void nvmaDestroyBuffer(long r0, long r2, long r4);

    public static void vmaDestroyBuffer(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VkBuffer") long r9, @org.lwjgl.system.NativeType("VmaAllocation") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r11
            nvmaDestroyBuffer(r0, r1, r2)
            return
    }

    public static native int nvmaCreateImage(long r0, long r2, long r4, long r6, long r8, long r10);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateImage(@org.lwjgl.system.NativeType("VmaAllocator") long r13, @org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r15, @org.lwjgl.system.NativeType("VmaAllocationCreateInfo const *") org.lwjgl.util.vma.VmaAllocationCreateInfo r16, @org.lwjgl.system.NativeType("VkImage *") java.nio.LongBuffer r17, @org.lwjgl.system.NativeType("VmaAllocation *") org.lwjgl.PointerBuffer r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VmaAllocationInfo *") org.lwjgl.util.vma.VmaAllocationInfo r19) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r13
            r1 = r15
            long r1 = r1.address()
            r2 = r16
            long r2 = r2.address()
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r19
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            int r0 = nvmaCreateImage(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static native int nvmaCreateAliasingImage(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateAliasingImage(@org.lwjgl.system.NativeType("VmaAllocator") long r9, @org.lwjgl.system.NativeType("VmaAllocation") long r11, @org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r13, @org.lwjgl.system.NativeType("VkImage *") java.nio.LongBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r9
            r1 = r11
            r2 = r13
            long r2 = r2.address()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nvmaCreateAliasingImage(r0, r1, r2, r3)
            return r0
    }

    public static native int nvmaCreateAliasingImage2(long r0, long r2, long r4, long r6, long r8);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateAliasingImage2(@org.lwjgl.system.NativeType("VmaAllocator") long r11, @org.lwjgl.system.NativeType("VmaAllocation") long r13, @org.lwjgl.system.NativeType("VkDeviceSize") long r15, @org.lwjgl.system.NativeType("VkImageCreateInfo const *") org.lwjgl.vulkan.VkImageCreateInfo r17, @org.lwjgl.system.NativeType("VkImage *") java.nio.LongBuffer r18) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r18
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            long r3 = r3.address()
            r4 = r18
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            int r0 = nvmaCreateAliasingImage2(r0, r1, r2, r3, r4)
            return r0
    }

    public static native void nvmaDestroyImage(long r0, long r2, long r4);

    public static void vmaDestroyImage(@org.lwjgl.system.NativeType("VmaAllocator") long r7, @org.lwjgl.system.NativeType("VkImage") long r9, @org.lwjgl.system.NativeType("VmaAllocation") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r11
            nvmaDestroyImage(r0, r1, r2)
            return
    }

    public static native int nvmaCreateVirtualBlock(long r0, long r2);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaCreateVirtualBlock(@org.lwjgl.system.NativeType("VmaVirtualBlockCreateInfo const *") org.lwjgl.util.vma.VmaVirtualBlockCreateInfo r5, @org.lwjgl.system.NativeType("VmaVirtualBlock *") org.lwjgl.PointerBuffer r6) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nvmaCreateVirtualBlock(r0, r1)
            return r0
    }

    public static native void nvmaDestroyVirtualBlock(long r0);

    public static void vmaDestroyVirtualBlock(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nvmaDestroyVirtualBlock(r0)
            return
    }

    public static native int nvmaIsVirtualBlockEmpty(long r0);

    @org.lwjgl.system.NativeType("VkBool32")
    public static boolean vmaIsVirtualBlockEmpty(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            int r0 = nvmaIsVirtualBlockEmpty(r0)
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    public static native void nvmaGetVirtualAllocationInfo(long r0, long r2, long r4);

    public static void vmaGetVirtualAllocationInfo(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r7, @org.lwjgl.system.NativeType("VmaVirtualAllocation") long r9, @org.lwjgl.system.NativeType("VmaVirtualAllocationInfo *") org.lwjgl.util.vma.VmaVirtualAllocationInfo r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L10:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = r2.address()
            nvmaGetVirtualAllocationInfo(r0, r1, r2)
            return
    }

    public static native int nvmaVirtualAllocate(long r0, long r2, long r4, long r6);

    @org.lwjgl.system.NativeType("VkResult")
    public static int vmaVirtualAllocate(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r9, @org.lwjgl.system.NativeType("VmaVirtualAllocationCreateInfo const *") org.lwjgl.util.vma.VmaVirtualAllocationCreateInfo r11, @org.lwjgl.system.NativeType("VmaVirtualAllocation *") org.lwjgl.PointerBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("VkDeviceSize *") java.nio.LongBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L16:
            r0 = r9
            r1 = r11
            long r1 = r1.address()
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            int r0 = nvmaVirtualAllocate(r0, r1, r2, r3)
            return r0
    }

    public static native void nvmaVirtualFree(long r0, long r2);

    public static void vmaVirtualFree(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r5, @org.lwjgl.system.NativeType("VmaVirtualAllocation") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            nvmaVirtualFree(r0, r1)
            return
    }

    public static native void nvmaClearVirtualBlock(long r0);

    public static void vmaClearVirtualBlock(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nvmaClearVirtualBlock(r0)
            return
    }

    public static native void nvmaSetVirtualAllocationUserData(long r0, long r2, long r4);

    public static void vmaSetVirtualAllocationUserData(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r7, @org.lwjgl.system.NativeType("VmaVirtualAllocation") long r9, @org.lwjgl.system.NativeType("void *") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L16:
            r0 = r7
            r1 = r9
            r2 = r11
            nvmaSetVirtualAllocationUserData(r0, r1, r2)
            return
    }

    public static native void nvmaGetVirtualBlockStatistics(long r0, long r2);

    public static void vmaGetVirtualBlockStatistics(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r5, @org.lwjgl.system.NativeType("VmaStatistics *") org.lwjgl.util.vma.VmaStatistics r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nvmaGetVirtualBlockStatistics(r0, r1)
            return
    }

    public static native void nvmaCalculateVirtualBlockStatistics(long r0, long r2);

    public static void vmaCalculateVirtualBlockStatistics(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r5, @org.lwjgl.system.NativeType("VmaDetailedStatistics *") org.lwjgl.util.vma.VmaDetailedStatistics r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            nvmaCalculateVirtualBlockStatistics(r0, r1)
            return
    }

    public static native void nvmaBuildVirtualBlockStatsString(long r0, long r2, int r4);

    public static void vmaBuildVirtualBlockStatsString(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r6, @org.lwjgl.system.NativeType("char **") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("VkBool32") boolean r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            nvmaBuildVirtualBlockStatsString(r0, r1, r2)
            return
    }

    public static native void nvmaFreeVirtualBlockStatsString(long r0, long r2);

    public static void vmaFreeVirtualBlockStatsString(@org.lwjgl.system.NativeType("VmaVirtualBlock") long r5, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nvmaFreeVirtualBlockStatsString(r0, r1)
            return
    }

    public static native void nvmaBuildStatsString(long r0, long r2, int r4);

    public static void vmaBuildStatsString(@org.lwjgl.system.NativeType("VmaAllocator") long r6, @org.lwjgl.system.NativeType("char **") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("VkBool32") boolean r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L10:
            r0 = r6
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            if (r2 == 0) goto L1d
            r2 = 1
            goto L1e
        L1d:
            r2 = 0
        L1e:
            nvmaBuildStatsString(r0, r1, r2)
            return
    }

    public static native void nvmaFreeStatsString(long r0, long r2);

    public static void vmaFreeStatsString(@org.lwjgl.system.NativeType("VmaAllocator") long r5, @org.lwjgl.system.NativeType("char *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nvmaFreeStatsString(r0, r1)
            return
    }

    static {
            org.lwjgl.util.vma.LibVma.initialize()
            return
    }
}
