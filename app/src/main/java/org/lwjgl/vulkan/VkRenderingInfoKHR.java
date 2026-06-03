package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfoKHR.class */
public class VkRenderingInfoKHR extends org.lwjgl.vulkan.VkRenderingInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkRenderingInfo.Buffer {
        private static final org.lwjgl.vulkan.VkRenderingInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderingInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderingInfoKHR r0 = org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000044000(0x3b9b75e0, float:0.0047442764)
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer renderArea(org.lwjgl.vulkan.VkRect2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.nrenderArea(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer renderArea(java.util.function.Consumer<org.lwjgl.vulkan.VkRect2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkRect2D r1 = r1.renderArea()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.nlayerCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.nviewMask(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.npColorAttachments(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer pDepthAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.npDepthAttachment(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer pStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR.npStencilAttachment(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer pStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.pStencilAttachment(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer pDepthAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.pDepthAttachment(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.pColorAttachments(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.viewMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer layerCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.layerCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer renderArea(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.renderArea(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer renderArea(org.lwjgl.vulkan.VkRect2D r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.renderArea(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.flags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderingInfoKHR r0 = org.lwjgl.vulkan.VkRenderingInfoKHR.create(r0)
                org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderingInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderingInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderingInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000044000(0x3b9b75e0, float:0.0047442764)
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR renderArea(org.lwjgl.vulkan.VkRect2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrenderArea(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR renderArea(java.util.function.Consumer<org.lwjgl.vulkan.VkRect2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkRect2D r1 = r1.renderArea()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlayerCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewMask(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorAttachments(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR pDepthAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDepthAttachment(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR pStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStencilAttachment(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public org.lwjgl.vulkan.VkRenderingInfoKHR set(int r5, long r6, int r8, org.lwjgl.vulkan.VkRect2D r9, int r10, int r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r12, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.renderArea(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.layerCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.viewMask(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pColorAttachments(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pDepthAttachment(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pStencilAttachment(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfoKHR set(org.lwjgl.vulkan.VkRenderingInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR malloc() {
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR calloc() {
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo set(int r13, long r14, int r16, org.lwjgl.vulkan.VkRect2D r17, int r18, int r19, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r20, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r21, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r22) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo pStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pStencilAttachment(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo pDepthAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pDepthAttachment(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pColorAttachments(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo viewMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.viewMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo layerCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.layerCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo renderArea(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.renderArea(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo renderArea(org.lwjgl.vulkan.VkRect2D r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.renderArea(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.flags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderingInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
