package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfo.class */
public class VkPipelineVertexInputDivisorStateCreateInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int VERTEXBINDINGDIVISORCOUNT = 0;
    public static final int PVERTEXBINDINGDIVISORS = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPipelineVertexInputDivisorStateCreateInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo, org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
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
        protected org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int vertexBindingDivisorCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.nvertexBindingDivisorCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkVertexInputBindingDivisorDescription const *")
        public org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription$Buffer r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.npVertexBindingDivisors(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000190001(0x3b9db031, float:0.0048122634)
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer pVertexBindingDivisors(@org.lwjgl.system.NativeType("VkVertexInputBindingDivisorDescription const *") org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.npVertexBindingDivisors(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6373create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.create(r0)
                org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPipelineVertexInputDivisorStateCreateInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPipelineVertexInputDivisorStateCreateInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int vertexBindingDivisorCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nvertexBindingDivisorCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkVertexInputBindingDivisorDescription const *")
    public org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer pVertexBindingDivisors() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription$Buffer r0 = npVertexBindingDivisors(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000190001(0x3b9db031, float:0.0048122634)
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo pVertexBindingDivisors(@org.lwjgl.system.NativeType("VkVertexInputBindingDivisorDescription const *") org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npVertexBindingDivisors(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo set(int r5, long r6, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = r0.pVertexBindingDivisors(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo set(org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo malloc() {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo calloc() {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo create() {
            int r0 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo create(long r6) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer r0 = new org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nvertexBindingDivisorCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer npVertexBindingDivisors(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nvertexBindingDivisorCount(r1)
            org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription$Buffer r0 = org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.create(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nvertexBindingDivisorCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npVertexBindingDivisors(long r5, org.lwjgl.vulkan.VkVertexInputBindingDivisorDescription.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nvertexBindingDivisorCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 4
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.VERTEXBINDINGDIVISORCOUNT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPipelineVertexInputDivisorStateCreateInfo.PVERTEXBINDINGDIVISORS = r0
            return
    }
}
