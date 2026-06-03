package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCreateInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCreateInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCreateInfo.class */
public class VkBufferCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkBufferCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int SIZE = 0;
    public static final int USAGE = 0;
    public static final int SHARINGMODE = 0;
    public static final int QUEUEFAMILYINDEXCOUNT = 0;
    public static final int PQUEUEFAMILYINDICES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCreateInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCreateInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkBufferCreateInfo, org.lwjgl.vulkan.VkBufferCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkBufferCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkBufferCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkBufferCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkBufferCreateInfo r0 = org.lwjgl.vulkan.VkBufferCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkBufferCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBufferCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkBufferCreateInfo.nsize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBufferUsageFlags")
        public int usage() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.nusage(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSharingMode")
        public int sharingMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.nsharingMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueFamilyIndexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.nqueueFamilyIndexCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pQueueFamilyIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkBufferCreateInfo.npQueueFamilyIndices(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 12
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkBufferDeviceAddressCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkBufferDeviceAddressCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkDedicatedAllocationBufferCreateInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDedicatedAllocationBufferCreateInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pNext(org.lwjgl.vulkan.VkVideoProfileListInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkVideoProfileListInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer flags(@org.lwjgl.system.NativeType("VkBufferCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCreateInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer size(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferCreateInfo.nsize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer usage(@org.lwjgl.system.NativeType("VkBufferUsageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCreateInfo.nusage(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer sharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCreateInfo.nsharingMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCreateInfo.nqueueFamilyIndexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferCreateInfo.Buffer pQueueFamilyIndices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferCreateInfo.npQueueFamilyIndices(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkBufferCreateInfo r0 = org.lwjgl.vulkan.VkBufferCreateInfo.create(r0)
                org.lwjgl.vulkan.VkBufferCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkBufferCreateInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkBufferCreateInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkBufferCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkBufferCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBufferUsageFlags")
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

    public org.lwjgl.vulkan.VkBufferCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 12
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkBufferDeviceAddressCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkBufferDeviceAddressCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkBufferOpaqueCaptureAddressCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkBufferUsageFlags2CreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkDedicatedAllocationBufferCreateInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDedicatedAllocationBufferCreateInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryBufferCreateInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pNext(org.lwjgl.vulkan.VkVideoProfileListInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkVideoProfileListInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo flags(@org.lwjgl.system.NativeType("VkBufferCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo size(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo usage(@org.lwjgl.system.NativeType("VkBufferUsageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nusage(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo sharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsharingMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueueFamilyIndexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo pQueueFamilyIndices(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQueueFamilyIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo set(int r5, long r6, int r8, long r9, int r11, int r12, int r13, @javax.annotation.Nullable java.nio.IntBuffer r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.size(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.usage(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.sharingMode(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.queueFamilyIndexCount(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.pQueueFamilyIndices(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferCreateInfo set(org.lwjgl.vulkan.VkBufferCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo malloc() {
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo calloc() {
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = new org.lwjgl.vulkan.VkBufferCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkBufferCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nsize(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nusage(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nsharingMode(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SHARINGMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueueFamilyIndexCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npQueueFamilyIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferCreateInfo.PQUEUEFAMILYINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nqueueFamilyIndexCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsize(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SIZE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nusage(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.USAGE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nsharingMode(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.SHARINGMODE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueueFamilyIndexCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferCreateInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npQueueFamilyIndices(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferCreateInfo.PQUEUEFAMILYINDICES
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

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBufferCreateInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkBufferCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkBufferCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkBufferCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.SIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.USAGE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.SHARINGMODE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferCreateInfo.PQUEUEFAMILYINDICES = r0
            return
    }
}
