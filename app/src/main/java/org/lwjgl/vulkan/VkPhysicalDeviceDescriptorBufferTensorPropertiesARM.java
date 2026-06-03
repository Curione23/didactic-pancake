package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.class */
public class VkPhysicalDeviceDescriptorBufferTensorPropertiesARM extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int TENSORCAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = 0;
    public static final int TENSORDESCRIPTORSIZE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM, org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
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
        protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long tensorCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long tensorViewCaptureReplayDescriptorDataSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorViewCaptureReplayDescriptorDataSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("size_t")
        public long tensorDescriptorSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorDescriptorSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000460019(0x3ba1cef3, float:0.0049380003)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer pNext(@org.lwjgl.system.NativeType("void *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer tensorCaptureReplayDescriptorDataSize(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorCaptureReplayDescriptorDataSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer tensorViewCaptureReplayDescriptorDataSize(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorViewCaptureReplayDescriptorDataSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer tensorDescriptorSize(@org.lwjgl.system.NativeType("size_t") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ntensorDescriptorSize(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m5343create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.create(r0)
                org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPhysicalDeviceDescriptorBufferTensorPropertiesARM(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
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

    @org.lwjgl.system.NativeType("size_t")
    public long tensorCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntensorCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long tensorViewCaptureReplayDescriptorDataSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntensorViewCaptureReplayDescriptorDataSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("size_t")
    public long tensorDescriptorSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ntensorDescriptorSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000460019(0x3ba1cef3, float:0.0049380003)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM pNext(@org.lwjgl.system.NativeType("void *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorCaptureReplayDescriptorDataSize(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntensorCaptureReplayDescriptorDataSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorViewCaptureReplayDescriptorDataSize(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntensorViewCaptureReplayDescriptorDataSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM tensorDescriptorSize(@org.lwjgl.system.NativeType("size_t") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ntensorDescriptorSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(int r5, long r6, long r8, long r10, long r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.tensorCaptureReplayDescriptorDataSize(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.tensorViewCaptureReplayDescriptorDataSize(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.tensorDescriptorSize(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM set(org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM malloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM calloc() {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create() {
            int r0 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM create(long r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
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

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer r0 = new org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ntensorCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ntensorViewCaptureReplayDescriptorDataSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long ntensorDescriptorSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntensorCaptureReplayDescriptorDataSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntensorViewCaptureReplayDescriptorDataSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void ntensorDescriptorSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORDESCRIPTORSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 5
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORCAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORVIEWCAPTUREREPLAYDESCRIPTORDATASIZE = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPhysicalDeviceDescriptorBufferTensorPropertiesARM.TENSORDESCRIPTORSIZE = r0
            return
    }
}
