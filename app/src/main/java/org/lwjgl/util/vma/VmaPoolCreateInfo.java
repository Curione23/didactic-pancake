package org.lwjgl.util.vma;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaPoolCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaPoolCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaPoolCreateInfo.class */
public class VmaPoolCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.util.vma.VmaPoolCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int MEMORYTYPEINDEX = 0;
    public static final int FLAGS = 0;
    public static final int BLOCKSIZE = 0;
    public static final int MINBLOCKCOUNT = 0;
    public static final int MAXBLOCKCOUNT = 0;
    public static final int PRIORITY = 0;
    public static final int MINALLOCATIONALIGNMENT = 0;
    public static final int PMEMORYALLOCATENEXT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaPoolCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaPoolCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/util/vma/VmaPoolCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.util.vma.VmaPoolCreateInfo, org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.util.vma.VmaPoolCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
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
        protected org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.util.vma.VmaPoolCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.util.vma.VmaPoolCreateInfo r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int memoryTypeIndex() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.nmemoryTypeIndex(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VmaPoolCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long blockSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.nblockSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long minBlockCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.nminBlockCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long maxBlockCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.nmaxBlockCount(r0)
                return r0
        }

        public float priority() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                float r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.npriority(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long minAllocationAlignment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.nminAllocationAlignment(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pMemoryAllocateNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.npMemoryAllocateNext(r0)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer memoryTypeIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaPoolCreateInfo.nmemoryTypeIndex(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VmaPoolCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaPoolCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer blockSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaPoolCreateInfo.nblockSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer minBlockCount(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaPoolCreateInfo.nminBlockCount(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer maxBlockCount(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaPoolCreateInfo.nmaxBlockCount(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer priority(float r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.util.vma.VmaPoolCreateInfo.npriority(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer minAllocationAlignment(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaPoolCreateInfo.nminAllocationAlignment(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.util.vma.VmaPoolCreateInfo.npMemoryAllocateNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkDedicatedAllocationMemoryAllocateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkDedicatedAllocationMemoryAllocateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryAllocateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkExportMemoryAllocateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryAllocateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkExportMemoryAllocateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryAllocateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkExportMemoryAllocateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkImportAndroidHardwareBufferInfoANDROID r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkImportAndroidHardwareBufferInfoANDROID r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryFdInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkImportMemoryFdInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryHostPointerInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkImportMemoryHostPointerInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMetalBufferInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkImportMetalBufferInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryAllocateFlagsInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryAllocateFlagsInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        public org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryPriorityAllocateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pMemoryAllocateNext()
                org.lwjgl.vulkan.VkMemoryPriorityAllocateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.pMemoryAllocateNext(r1)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.util.vma.VmaPoolCreateInfo r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.create(r0)
                org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VmaPoolCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.util.vma.VmaPoolCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VmaPoolCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int memoryTypeIndex() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nmemoryTypeIndex(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VmaPoolCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long blockSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nblockSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long minBlockCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminBlockCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long maxBlockCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nmaxBlockCount(r0)
            return r0
    }

    public float priority() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            float r0 = npriority(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long minAllocationAlignment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nminAllocationAlignment(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void *")
    public long pMemoryAllocateNext() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = npMemoryAllocateNext(r0)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo memoryTypeIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nmemoryTypeIndex(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo flags(@org.lwjgl.system.NativeType("VmaPoolCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo blockSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nblockSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo minBlockCount(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nminBlockCount(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo maxBlockCount(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nmaxBlockCount(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo priority(float r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npriority(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo minAllocationAlignment(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nminAllocationAlignment(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npMemoryAllocateNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkDedicatedAllocationMemoryAllocateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkDedicatedAllocationMemoryAllocateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryAllocateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkExportMemoryAllocateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryAllocateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkExportMemoryAllocateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryAllocateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkExportMemoryAllocateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkExportMemoryWin32HandleInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkExportMetalObjectCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkImportAndroidHardwareBufferInfoANDROID r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkImportAndroidHardwareBufferInfoANDROID r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryFdInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkImportMemoryFdInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryHostPointerInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkImportMemoryHostPointerInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkImportMemoryWin32HandleInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkImportMetalBufferInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkImportMetalBufferInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryAllocateFlagsInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryAllocateFlagsInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryAllocateFlagsInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryDedicatedAllocateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryOpaqueCaptureAddressAllocateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo pMemoryAllocateNext(org.lwjgl.vulkan.VkMemoryPriorityAllocateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pMemoryAllocateNext()
            org.lwjgl.vulkan.VkMemoryPriorityAllocateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo set(int r5, int r6, long r7, long r9, long r11, float r13, long r14, long r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.memoryTypeIndex(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.blockSize(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.minBlockCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.maxBlockCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.priority(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.minAllocationAlignment(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.pMemoryAllocateNext(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.util.vma.VmaPoolCreateInfo set(org.lwjgl.util.vma.VmaPoolCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo malloc() {
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            int r2 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo calloc() {
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo create() {
            int r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo create(long r6) {
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaPoolCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
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

    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.ALIGNOF
            int r4 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.util.vma.VmaPoolCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer r0 = new org.lwjgl.util.vma.VmaPoolCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nmemoryTypeIndex(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.MEMORYTYPEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nblockSize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.BLOCKSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nminBlockCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.MINBLOCKCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nmaxBlockCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.MAXBLOCKCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static float npriority(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.PRIORITY
            long r3 = (long) r3
            long r2 = r2 + r3
            float r0 = r0.getFloat(r1, r2)
            return r0
    }

    public static long nminAllocationAlignment(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.MINALLOCATIONALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long npMemoryAllocateNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.PMEMORYALLOCATENEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nmemoryTypeIndex(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.MEMORYTYPEINDEX
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nblockSize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.BLOCKSIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nminBlockCount(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.MINBLOCKCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nmaxBlockCount(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.MAXBLOCKCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npriority(long r7, float r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.PRIORITY
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putFloat(r1, r2, r3)
            return
    }

    public static void nminAllocationAlignment(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.util.vma.VmaPoolCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.MINALLOCATIONALIGNMENT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void npMemoryAllocateNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.util.vma.VmaPoolCreateInfo.PMEMORYALLOCATENEXT
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
            org.lwjgl.util.vma.VmaPoolCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.util.vma.VmaPoolCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.util.vma.VmaPoolCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.util.vma.VmaPoolCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.MEMORYTYPEINDEX = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.BLOCKSIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.MINBLOCKCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.MAXBLOCKCOUNT = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.PRIORITY = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.MINALLOCATIONALIGNMENT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.util.vma.VmaPoolCreateInfo.PMEMORYALLOCATENEXT = r0
            return
    }
}
