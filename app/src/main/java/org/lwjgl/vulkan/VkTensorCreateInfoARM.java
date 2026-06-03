package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTensorCreateInfoARM.class */
public class VkTensorCreateInfoARM extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkTensorCreateInfoARM> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int PDESCRIPTION = 0;
    public static final int SHARINGMODE = 0;
    public static final int QUEUEFAMILYINDEXCOUNT = 0;
    public static final int PQUEUEFAMILYINDICES = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkTensorCreateInfoARM$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkTensorCreateInfoARM, org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkTensorCreateInfoARM ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
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

        Buffer(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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
        protected org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
                r1 = r0
                r2 = r11
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                r7 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkTensorCreateInfoARM getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkTensorCreateFlagsARM")
        public long flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkTensorDescriptionARM const *")
        public org.lwjgl.vulkan.VkTensorDescriptionARM pDescription() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkTensorDescriptionARM r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.npDescription(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSharingMode")
        public int sharingMode() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.nsharingMode(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int queueFamilyIndexCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.nqueueFamilyIndexCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pQueueFamilyIndices() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.npQueueFamilyIndices(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTensorCreateInfoARM.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000460000(0x3ba1cee0, float:0.0049379915)
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTensorCreateInfoARM.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer pNext(org.lwjgl.vulkan.VkExternalMemoryTensorCreateInfoARM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkExternalMemoryTensorCreateInfoARM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer pNext(org.lwjgl.vulkan.VkOpaqueCaptureDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpaqueCaptureDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer flags(@org.lwjgl.system.NativeType("VkTensorCreateFlagsARM") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkTensorCreateInfoARM.nflags(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer pDescription(@org.lwjgl.system.NativeType("VkTensorDescriptionARM const *") org.lwjgl.vulkan.VkTensorDescriptionARM r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTensorCreateInfoARM.npDescription(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer sharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTensorCreateInfoARM.nsharingMode(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTensorCreateInfoARM.nqueueFamilyIndexCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer pQueueFamilyIndices(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkTensorCreateInfoARM.npQueueFamilyIndices(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m6865create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.create(r0)
                org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkTensorCreateInfoARM(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkTensorCreateInfoARM create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkTensorCreateInfoARM(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
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

    @org.lwjgl.system.NativeType("VkTensorCreateFlagsARM")
    public long flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkTensorDescriptionARM const *")
    public org.lwjgl.vulkan.VkTensorDescriptionARM pDescription() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkTensorDescriptionARM r0 = npDescription(r0)
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

    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pQueueFamilyIndices() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npQueueFamilyIndices(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000460000(0x3ba1cee0, float:0.0049379915)
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM pNext(org.lwjgl.vulkan.VkExternalMemoryTensorCreateInfoARM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkExternalMemoryTensorCreateInfoARM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM pNext(org.lwjgl.vulkan.VkOpaqueCaptureDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpaqueCaptureDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM pNext(org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkOpaqueCaptureDescriptorDataCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM flags(@org.lwjgl.system.NativeType("VkTensorCreateFlagsARM") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nflags(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM pDescription(@org.lwjgl.system.NativeType("VkTensorDescriptionARM const *") org.lwjgl.vulkan.VkTensorDescriptionARM r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescription(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM sharingMode(@org.lwjgl.system.NativeType("VkSharingMode") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsharingMode(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM queueFamilyIndexCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueueFamilyIndexCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM pQueueFamilyIndices(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npQueueFamilyIndices(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM set(int r5, long r6, long r8, org.lwjgl.vulkan.VkTensorDescriptionARM r10, int r11, int r12, java.nio.IntBuffer r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.flags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.pDescription(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.sharingMode(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.queueFamilyIndexCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.pQueueFamilyIndices(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkTensorCreateInfoARM set(org.lwjgl.vulkan.VkTensorCreateInfoARM r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM malloc() {
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM calloc() {
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM create() {
            int r0 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM create(long r6) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
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

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorCreateInfoARM.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer r0 = new org.lwjgl.vulkan.VkTensorCreateInfoARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nflags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkTensorDescriptionARM npDescription(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PDESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkTensorDescriptionARM r0 = org.lwjgl.vulkan.VkTensorDescriptionARM.create(r0)
            return r0
    }

    public static int nsharingMode(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SHARINGMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nqueueFamilyIndexCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.QUEUEFAMILYINDEXCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.IntBuffer npQueueFamilyIndices(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PQUEUEFAMILYINDICES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nqueueFamilyIndexCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.FLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void npDescription(long r5, org.lwjgl.vulkan.VkTensorDescriptionARM r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PDESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsharingMode(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.SHARINGMODE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nqueueFamilyIndexCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.QUEUEFAMILYINDEXCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npQueueFamilyIndices(long r5, java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PQUEUEFAMILYINDICES
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

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkTensorCreateInfoARM.PDESCRIPTION
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r7 = r0
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            org.lwjgl.vulkan.VkTensorDescriptionARM.validate(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkTensorCreateInfoARM r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 7
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkTensorCreateInfoARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkTensorCreateInfoARM.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkTensorCreateInfoARM.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.PDESCRIPTION = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.SHARINGMODE = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.QUEUEFAMILYINDEXCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkTensorCreateInfoARM.PQUEUEFAMILYINDICES = r0
            return
    }
}
