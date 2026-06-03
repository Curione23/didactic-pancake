package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectInfoKHR.class */
public class VkCopyMemoryIndirectInfoKHR extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int SRCCOPYFLAGS = 0;
    public static final int DSTCOPYFLAGS = 0;
    public static final int COPYCOUNT = 0;
    public static final int COPYADDRESSRANGE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCopyMemoryIndirectInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR, org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
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
        protected org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
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
        protected org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR")
        public int srcCopyFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.nsrcCopyFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR")
        public int dstCopyFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ndstCopyFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int copyCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ncopyCount(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR copyAddressRange() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ncopyAddressRange(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000549002(0x3ba32a8a, float:0.0049794363)
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer srcCopyFlags(@org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.nsrcCopyFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer dstCopyFlags(@org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ndstCopyFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer copyCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ncopyCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer copyAddressRange(org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ncopyAddressRange(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer copyAddressRange(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r1 = r1.copyAddressRange()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4213create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.create(r0)
                org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCopyMemoryIndirectInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCopyMemoryIndirectInfoKHR(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
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

    @org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR")
    public int srcCopyFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsrcCopyFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR")
    public int dstCopyFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndstCopyFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int copyCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncopyCount(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR copyAddressRange() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r0 = ncopyAddressRange(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000549002(0x3ba32a8a, float:0.0049794363)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR srcCopyFlags(@org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcCopyFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR dstCopyFlags(@org.lwjgl.system.NativeType("VkAddressCopyFlagsKHR") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstCopyFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR copyCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncopyCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR copyAddressRange(org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncopyAddressRange(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR copyAddressRange(java.util.function.Consumer<org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r1 = r1.copyAddressRange()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR set(int r5, long r6, int r8, int r9, int r10, org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.srcCopyFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.dstCopyFlags(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.copyCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.copyAddressRange(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR set(org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR malloc() {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR calloc() {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nsrcCopyFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SRCCOPYFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndstCopyFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.DSTCOPYFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ncopyCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.COPYCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR ncopyAddressRange(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.COPYADDRESSRANGE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r0 = org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR.create(r0)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nsrcCopyFlags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SRCCOPYFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndstCopyFlags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.DSTCOPYFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncopyCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.COPYCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ncopyAddressRange(long r7, org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.COPYADDRESSRANGE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 6
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR.SIZEOF
            int r4 = org.lwjgl.vulkan.VkStridedDeviceAddressRangeKHR.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.SRCCOPYFLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.DSTCOPYFLAGS = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.COPYCOUNT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCopyMemoryIndirectInfoKHR.COPYADDRESSRANGE = r0
            return
    }
}
