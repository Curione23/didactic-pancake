package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushConstantsInfo.class */
public class VkPushConstantsInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPushConstantsInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int LAYOUT = 0;
    public static final int STAGEFLAGS = 0;
    public static final int OFFSET = 0;
    public static final int SIZE = 0;
    public static final int PVALUES = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushConstantsInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPushConstantsInfo, org.lwjgl.vulkan.VkPushConstantsInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPushConstantsInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPushConstantsInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPushConstantsInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
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
        protected org.lwjgl.vulkan.VkPushConstantsInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPushConstantsInfo r0 = org.lwjgl.vulkan.VkPushConstantsInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushConstantsInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPushConstantsInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long layout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPushConstantsInfo.nlayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int stageFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushConstantsInfo.nstageFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int offset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushConstantsInfo.noffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int size() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushConstantsInfo.nsize(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public java.nio.ByteBuffer pValues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.ByteBuffer r0 = org.lwjgl.vulkan.VkPushConstantsInfo.npValues(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000545004(0x3ba31aec, float:0.0049775746)
                org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushConstantsInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer pNext(org.lwjgl.vulkan.VkPushConstantBankInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPushConstantBankInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushConstantsInfo.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfo.nstageFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfo.noffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPushConstantsInfo.Buffer pValues(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfo.npValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6438create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPushConstantsInfo r0 = org.lwjgl.vulkan.VkPushConstantsInfo.create(r0)
                org.lwjgl.vulkan.VkPushConstantsInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPushConstantsInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPushConstantsInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPushConstantsInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkPipelineLayout")
    public long layout() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nlayout(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int stageFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstageFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int offset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = noffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int size() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsize(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("void const *")
    public java.nio.ByteBuffer pValues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.ByteBuffer r0 = npValues(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000545004(0x3ba31aec, float:0.0049775746)
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo pNext(org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo pNext(org.lwjgl.vulkan.VkPushConstantBankInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPushConstantBankInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstageFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo pValues(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npValues(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo set(int r5, long r6, long r8, int r10, int r11, java.nio.ByteBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.layout(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.stageFlags(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.offset(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.pValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfo set(org.lwjgl.vulkan.VkPushConstantsInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo malloc() {
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo calloc() {
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo create() {
            int r0 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo create(long r6) {
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = new org.lwjgl.vulkan.VkPushConstantsInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushConstantsInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nlayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.LAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nstageFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.STAGEFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int noffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int nsize(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static java.nio.ByteBuffer npValues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.PVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsize(r1)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nlayout(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.LAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nstageFlags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.STAGEFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void noffset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.OFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nsize(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.SIZE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npValues(long r5, java.nio.ByteBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.PVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nsize(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfo.PVALUES
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
            org.lwjgl.vulkan.VkPushConstantsInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPushConstantsInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPushConstantsInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.LAYOUT = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.STAGEFLAGS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.OFFSET = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.SIZE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushConstantsInfo.PVALUES = r0
            return
    }
}
