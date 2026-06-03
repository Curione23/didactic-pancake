package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR.class */
public class VkCommandBufferInheritanceRenderingInfoKHR extends org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceRenderingInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer {
        private static final org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR ELEMENT_FACTORY = null;

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

        Buffer(long r10, @javax.annotation.Nullable java.nio.ByteBuffer r12, int r13, int r14, int r15, int r16) {
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

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000044004(0x3b9b75e4, float:0.0047442783)
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.nviewMask(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer pColorAttachmentFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.npColorAttachmentFormats(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer depthAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.ndepthAttachmentFormat(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer stencilAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.nstencilAttachmentFormat(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer rasterizationSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.nrasterizationSamples(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer rasterizationSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.rasterizationSamples(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer stencilAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.stencilAttachmentFormat(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer depthAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.depthAttachmentFormat(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer pColorAttachmentFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.pColorAttachmentFormats(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.viewMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.flags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.create(r0)
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCommandBufferInheritanceRenderingInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCommandBufferInheritanceRenderingInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000044004(0x3b9b75e4, float:0.0047442783)
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewMask(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR pColorAttachmentFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorAttachmentFormats(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR depthAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndepthAttachmentFormat(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR stencilAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstencilAttachmentFormat(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR rasterizationSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrasterizationSamples(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR set(int r5, long r6, int r8, int r9, @javax.annotation.Nullable java.nio.IntBuffer r10, int r11, int r12, int r13) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.viewMask(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.pColorAttachmentFormats(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.depthAttachmentFormat(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.stencilAttachmentFormat(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.rasterizationSamples(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR set(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR malloc() {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR calloc() {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo set(int r12, long r13, int r15, int r16, @javax.annotation.Nullable java.nio.IntBuffer r17, int r18, int r19, int r20) {
            r11 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo rasterizationSamples(@org.lwjgl.system.NativeType("VkSampleCountFlagBits") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.rasterizationSamples(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo stencilAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.stencilAttachmentFormat(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo depthAttachmentFormat(@org.lwjgl.system.NativeType("VkFormat") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.depthAttachmentFormat(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo pColorAttachmentFormats(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkFormat const *") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.pColorAttachmentFormats(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo viewMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.viewMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.flags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
