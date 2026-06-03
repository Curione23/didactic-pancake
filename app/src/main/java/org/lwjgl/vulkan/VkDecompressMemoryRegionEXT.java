package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionEXT.class */
public class VkDecompressMemoryRegionEXT extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkDecompressMemoryRegionEXT> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int SRCADDRESS = 0;
    public static final int DSTADDRESS = 0;
    public static final int COMPRESSEDSIZE = 0;
    public static final int DECOMPRESSEDSIZE = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkDecompressMemoryRegionEXT$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkDecompressMemoryRegionEXT, org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkDecompressMemoryRegionEXT ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
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
        protected org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
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
        protected org.lwjgl.vulkan.VkDecompressMemoryRegionEXT getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long srcAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.nsrcAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceAddress")
        public long dstAddress() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ndstAddress(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long compressedSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ncompressedSize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long decompressedSize() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ndecompressedSize(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer srcAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.nsrcAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer dstAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ndstAddress(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer compressedSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ncompressedSize(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer decompressedSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ndecompressedSize(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer m4334create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.create(r0)
                org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkDecompressMemoryRegionEXT(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkDecompressMemoryRegionEXT create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkDecompressMemoryRegionEXT(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long srcAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nsrcAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceAddress")
    public long dstAddress() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndstAddress(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long compressedSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ncompressedSize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long decompressedSize() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = ndecompressedSize(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT srcAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT dstAddress(@org.lwjgl.system.NativeType("VkDeviceAddress") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstAddress(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT compressedSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ncompressedSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT decompressedSize(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndecompressedSize(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT set(long r5, long r7, long r9, long r11) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = r0.srcAddress(r1)
            r0 = r4
            r1 = r7
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = r0.dstAddress(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = r0.compressedSize(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = r0.decompressedSize(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkDecompressMemoryRegionEXT set(org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT malloc() {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT calloc() {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT create() {
            int r0 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT create(long r6) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
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

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer r0 = new org.lwjgl.vulkan.VkDecompressMemoryRegionEXT$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static long nsrcAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SRCADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ndstAddress(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.DSTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ncompressedSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.COMPRESSEDSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static long ndecompressedSize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.DECOMPRESSEDSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static void nsrcAddress(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SRCADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ndstAddress(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.DSTADDRESS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ncompressedSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.COMPRESSEDSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void ndecompressedSize(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.DECOMPRESSEDSIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.SRCADDRESS = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.DSTADDRESS = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.COMPRESSEDSIZE = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkDecompressMemoryRegionEXT.DECOMPRESSEDSIZE = r0
            return
    }
}
