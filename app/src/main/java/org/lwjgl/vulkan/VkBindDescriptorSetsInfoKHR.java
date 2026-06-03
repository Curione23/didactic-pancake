package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindDescriptorSetsInfoKHR.class */
public class VkBindDescriptorSetsInfoKHR extends org.lwjgl.vulkan.VkBindDescriptorSetsInfo {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBindDescriptorSetsInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer {
        private static final org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.<init>(r1)
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

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        protected org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
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

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000545003(0x3ba31aeb, float:0.004977574)
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.nstageFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer firstSet(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.nfirstSet(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer pDescriptorSets(@org.lwjgl.system.NativeType("VkDescriptorSet const *") java.nio.LongBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.npDescriptorSets(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer dynamicOffsetCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.ndynamicOffsetCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer pDynamicOffsets(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.npDynamicOffsets(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer pDynamicOffsets(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.pDynamicOffsets(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer dynamicOffsetCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.dynamicOffsetCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer pDescriptorSets(@org.lwjgl.system.NativeType("VkDescriptorSet const *") java.nio.LongBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.pDescriptorSets(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer firstSet(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.firstSet(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.layout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.stageFlags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer
        /* JADX INFO: renamed from: create */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo3970create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.create(r0)
                org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkBindDescriptorSetsInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkBindDescriptorSetsInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000545003(0x3ba31aeb, float:0.004977574)
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstageFlags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR firstSet(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nfirstSet(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR pDescriptorSets(@org.lwjgl.system.NativeType("VkDescriptorSet const *") java.nio.LongBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorSets(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR dynamicOffsetCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndynamicOffsetCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR pDynamicOffsets(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDynamicOffsets(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR set(int r5, long r6, int r8, long r9, int r11, java.nio.LongBuffer r12, int r13, java.nio.IntBuffer r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.stageFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.layout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.firstSet(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.pDescriptorSets(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.dynamicOffsetCount(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.pDynamicOffsets(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR set(org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR malloc() {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR calloc() {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo set(int r13, long r14, int r16, long r17, int r19, java.nio.LongBuffer r20, int r21, java.nio.IntBuffer r22) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo pDynamicOffsets(@org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.pDynamicOffsets(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo dynamicOffsetCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.dynamicOffsetCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo pDescriptorSets(@org.lwjgl.system.NativeType("VkDescriptorSet const *") java.nio.LongBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.pDescriptorSets(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo firstSet(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.firstSet(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.layout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.stageFlags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBindDescriptorSetsInfo create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBindDescriptorSetsInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBindDescriptorSetsInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
