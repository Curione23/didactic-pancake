package org.lwjgl.vulkan;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushConstantsInfoKHR.class */
public class VkPushConstantsInfoKHR extends org.lwjgl.vulkan.VkPushConstantsInfo {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkPushConstantsInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkPushConstantsInfo.Buffer {
        private static final org.lwjgl.vulkan.VkPushConstantsInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        protected org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer create(long r11, java.nio.ByteBuffer r13, int r14, int r15, int r16, int r17) {
                r10 = this;
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
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

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkPushConstantsInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000545004(0x3ba31aec, float:0.0049775746)
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.nlayout(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.nstageFlags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.noffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer pValues(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.npValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer pValues(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.pValues(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer offset(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.offset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.stageFlags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.layout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer
        /* JADX INFO: renamed from: create */
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer mo6438create(long r10, java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
                r9 = this;
                r0 = r9
                r1 = r10
                r2 = r12
                r3 = r13
                r4 = r14
                r5 = r15
                r6 = r16
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.create(r1, r2, r3, r4, r5, r6)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkPushConstantsInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.create(r0)
                org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkPushConstantsInfoKHR(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkPushConstantsInfoKHR create(long r7, java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkPushConstantsInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000545004(0x3ba31aec, float:0.0049775746)
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nlayout(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstageFlags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR offset(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noffset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR pValues(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npValues(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public org.lwjgl.vulkan.VkPushConstantsInfoKHR set(int r5, long r6, long r8, int r10, int r11, java.nio.ByteBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.layout(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.stageFlags(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.offset(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.pValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkPushConstantsInfoKHR set(org.lwjgl.vulkan.VkPushConstantsInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR malloc() {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR calloc() {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkPushConstantsInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkPushConstantsInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkPushConstantsInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo set(int r11, long r12, long r14, int r16, int r17, java.nio.ByteBuffer r18) {
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo pValues(@org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.pValues(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo offset(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.offset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo stageFlags(@org.lwjgl.system.NativeType("VkShaderStageFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.stageFlags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo layout(@org.lwjgl.system.NativeType("VkPipelineLayout") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.layout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkPushConstantsInfo create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkPushConstantsInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkPushConstantsInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
