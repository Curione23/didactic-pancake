package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfoKHR.class */
public class VkPushDescriptorSetInfoKHR extends org.lwjgl.vulkan.VkPushDescriptorSetInfo {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushDescriptorSetInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer {
        private static final org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        protected org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
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

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000545005(0x3ba31aed, float:0.004977575)
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.nstageFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.nset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer pDescriptorWrites(@org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.npDescriptorWrites(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer pDescriptorWrites(@org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.pDescriptorWrites(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer set(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.set(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.layout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.stageFlags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer
        /* JADX INFO: renamed from: create */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6445create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.create(r0)
                org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPushDescriptorSetInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPushDescriptorSetInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000545005(0x3ba31aed, float:0.004977575)
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstageFlags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR set(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR pDescriptorWrites(@org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDescriptorWrites(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR set(int r5, long r6, int r8, long r9, int r11, org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.stageFlags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.layout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.set(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.pDescriptorWrites(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR set(org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR malloc() {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR calloc() {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo set(int r11, long r12, int r14, long r15, int r17, org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r15
            r5 = r17
            r6 = r18
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo pDescriptorWrites(@org.lwjgl.system.NativeType("VkWriteDescriptorSet const *") org.lwjgl.vulkan.VkWriteDescriptorSet.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.pDescriptorWrites(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo set(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.set(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.layout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.stageFlags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushDescriptorSetInfo create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushDescriptorSetInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPushDescriptorSetInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
