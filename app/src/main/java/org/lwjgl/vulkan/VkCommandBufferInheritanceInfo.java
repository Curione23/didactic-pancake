package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo.class */
public class VkCommandBufferInheritanceInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkCommandBufferInheritanceInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int RENDERPASS = 0;
    public static final int SUBPASS = 0;
    public static final int FRAMEBUFFER = 0;
    public static final int OCCLUSIONQUERYENABLE = 0;
    public static final int QUERYFLAGS = 0;
    public static final int PIPELINESTATISTICS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkCommandBufferInheritanceInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkCommandBufferInheritanceInfo, org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkCommandBufferInheritanceInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
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

        @Override // org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkCommandBufferInheritanceInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRenderPass")
        public long renderPass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nrenderPass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int subpass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nsubpass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFramebuffer")
        public long framebuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nframebuffer(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkBool32")
        public boolean occlusionQueryEnable() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nocclusionQueryEnable(r0)
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @org.lwjgl.system.NativeType("VkQueryControlFlags")
        public int queryFlags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nqueryFlags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags")
        public int pipelineStatistics() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.npipelineStatistics(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 41
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceConditionalRenderingInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkCommandBufferInheritanceConditionalRenderingInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderPassTransformInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderPassTransformInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceViewportScissorInfoNV r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkCommandBufferInheritanceViewportScissorInfoNV r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pNext(org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer renderPass(@org.lwjgl.system.NativeType("VkRenderPass") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nrenderPass(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer subpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nsubpass(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer framebuffer(@org.lwjgl.system.NativeType("VkFramebuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nframebuffer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer occlusionQueryEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nocclusionQueryEnable(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer queryFlags(@org.lwjgl.system.NativeType("VkQueryControlFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.nqueryFlags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer pipelineStatistics(@org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.npipelineStatistics(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.create(r0)
                org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkCommandBufferInheritanceInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkCommandBufferInheritanceInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkCommandBufferInheritanceInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkRenderPass")
    public long renderPass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nrenderPass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int subpass() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsubpass(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkFramebuffer")
    public long framebuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nframebuffer(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkBool32")
    public boolean occlusionQueryEnable() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nocclusionQueryEnable(r0)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.lwjgl.system.NativeType("VkQueryControlFlags")
    public int queryFlags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nqueryFlags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags")
    public int pipelineStatistics() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = npipelineStatistics(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 41
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoAMD r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkAttachmentSampleCountInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceConditionalRenderingInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkCommandBufferInheritanceConditionalRenderingInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderPassTransformInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderPassTransformInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkCommandBufferInheritanceRenderingInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkCommandBufferInheritanceViewportScissorInfoNV r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkCommandBufferInheritanceViewportScissorInfoNV r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pNext(org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo renderPass(@org.lwjgl.system.NativeType("VkRenderPass") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nrenderPass(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo subpass(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubpass(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo framebuffer(@org.lwjgl.system.NativeType("VkFramebuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nframebuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo occlusionQueryEnable(@org.lwjgl.system.NativeType("VkBool32") boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            if (r1 == 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            nocclusionQueryEnable(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo queryFlags(@org.lwjgl.system.NativeType("VkQueryControlFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nqueryFlags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo pipelineStatistics(@org.lwjgl.system.NativeType("VkQueryPipelineStatisticFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npipelineStatistics(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo set(int r5, long r6, long r8, int r10, long r11, boolean r13, int r14, int r15) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.renderPass(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.subpass(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.framebuffer(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.occlusionQueryEnable(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.queryFlags(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.pipelineStatistics(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkCommandBufferInheritanceInfo set(org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo malloc() {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo calloc() {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo create() {
            int r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo create(long r6) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
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

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer r0 = new org.lwjgl.vulkan.VkCommandBufferInheritanceInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nrenderPass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.RENDERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nsubpass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long nframebuffer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.FRAMEBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nocclusionQueryEnable(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nqueryFlags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.QUERYFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int npipelineStatistics(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PIPELINESTATISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nrenderPass(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.RENDERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nsubpass(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SUBPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nframebuffer(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.FRAMEBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nocclusionQueryEnable(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nqueryFlags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.QUERYFLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npipelineStatistics(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PIPELINESTATISTICS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 8
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.POINTER_SIZE
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
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.RENDERPASS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.SUBPASS = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.FRAMEBUFFER = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.OCCLUSIONQUERYENABLE = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.QUERYFLAGS = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkCommandBufferInheritanceInfo.PIPELINESTATISTICS = r0
            return
    }
}
