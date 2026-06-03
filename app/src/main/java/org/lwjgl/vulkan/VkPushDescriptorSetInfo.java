package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfo.class */
public class VkPushDescriptorSetInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkPushDescriptorSetInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int STAGEFLAGS = 0;
    public static final int LAYOUT = 0;
    public static final int SET = 0;
    public static final int DESCRIPTORWRITECOUNT = 0;
    public static final int PDESCRIPTORWRITES = 0;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkPushDescriptorSetInfo, org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkPushDescriptorSetInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        protected org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
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
        protected org.lwjgl.vulkan.VkPushDescriptorSetInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkShaderStageFlags")
        public int stageFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.nstageFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkPipelineLayout")
        public long layout() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.nlayout(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int set() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.nset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int descriptorWriteCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.ndescriptorWriteCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkWriteDescriptorSet const *")
        public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pDescriptorWrites() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.npDescriptorWrites(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000545005(0x3ba31aed, float:0.004977575)
                org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer pNext(org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.nstageFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.nset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer pDescriptorWrites(@org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.npDescriptorWrites(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.getElementFactory()
                return r0
        }

        /* JADX INFO: renamed from: create, reason: collision with other method in class */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6445create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.create(r0)
                org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPushDescriptorSetInfo(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPushDescriptorSetInfo create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPushDescriptorSetInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkShaderStageFlags")
    public int stageFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nstageFlags(r0)
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

    @org.lwjgl.system.NativeType("uint32_t")
    public int set() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int descriptorWriteCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndescriptorWriteCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkWriteDescriptorSet const *")
    public org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer pDescriptorWrites() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = npDescriptorWrites(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000545005(0x3ba31aed, float:0.004977575)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo pNext(org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkPipelineLayoutCreateInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstageFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo pDescriptorWrites(@org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorWrites(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo set(int r5, long r6, int r8, long r9, int r11, org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.stageFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.layout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.set(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.pDescriptorWrites(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfo set(org.lwjgl.vulkan.VkPushDescriptorSetInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo malloc() {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo calloc() {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo create() {
            int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo create(long r6) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
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

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nstageFlags(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.STAGEFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static long nlayout(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.LAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetLong(r0)
            return r0
    }

    public static int nset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SET
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static int ndescriptorWriteCount(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            int r0 = org.lwjgl.system.MemoryUtil.memGetInt(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer npDescriptorWrites(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.PDESCRIPTORWRITES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndescriptorWriteCount(r1)
            org.lwjgl.vulkan.VkWriteDescriptorSet$Buffer r0 = org.lwjgl.vulkan.VkWriteDescriptorSet.create(r0, r1)
            return r0
    }

    public static void nsType(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.STYPE
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nstageFlags(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.STAGEFLAGS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void nlayout(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.LAYOUT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutLong(r0, r1)
            return
    }

    public static void nset(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.SET
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void ndescriptorWriteCount(long r5, int r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutInt(r0, r1)
            return
    }

    public static void npDescriptorWrites(long r5, org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.PDESCRIPTORWRITES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            ndescriptorWriteCount(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.PDESCRIPTORWRITES
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
            org.lwjgl.vulkan.VkPushDescriptorSetInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.POINTER_SIZE
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
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.STAGEFLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.LAYOUT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.SET = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.DESCRIPTORWRITECOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkPushDescriptorSetInfo.PDESCRIPTORWRITES = r0
            return
    }
}
