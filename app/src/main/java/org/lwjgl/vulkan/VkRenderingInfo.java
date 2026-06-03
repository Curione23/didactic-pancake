package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfo.class */
public class VkRenderingInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRenderingInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int RENDERAREA = 0;
    public static final int LAYERCOUNT = 0;
    public static final int VIEWMASK = 0;
    public static final int COLORATTACHMENTCOUNT = 0;
    public static final int PCOLORATTACHMENTS = 0;
    public static final int PDEPTHATTACHMENT = 0;
    public static final int PSTENCILATTACHMENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRenderingInfo, org.lwjgl.vulkan.VkRenderingInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRenderingInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkRenderingInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderingInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderingInfo r0 = org.lwjgl.vulkan.VkRenderingInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderingInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRenderingFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingInfo.nflags(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRect2D renderArea() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRect2D r0 = org.lwjgl.vulkan.VkRenderingInfo.nrenderArea(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int layerCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingInfo.nlayerCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int viewMask() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingInfo.nviewMask(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int colorAttachmentCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderingInfo.ncolorAttachmentCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *")
        public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer pColorAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = org.lwjgl.vulkan.VkRenderingInfo.npColorAttachments(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *")
        public org.lwjgl.vulkan.VkRenderingAttachmentInfo pDepthAttachment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = org.lwjgl.vulkan.VkRenderingInfo.npDepthAttachment(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *")
        public org.lwjgl.vulkan.VkRenderingAttachmentInfo pStencilAttachment() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = org.lwjgl.vulkan.VkRenderingInfo.npStencilAttachment(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000044000(0x3b9b75e0, float:0.0047442764)
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkMultisampledRenderToSingleSampledInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkMultisampledRenderToSingleSampledInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkRenderingFragmentDensityMapAttachmentInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderingFragmentDensityMapAttachmentInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pNext(org.lwjgl.vulkan.VkRenderingFragmentShadingRateAttachmentInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderingFragmentShadingRateAttachmentInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer renderArea(org.lwjgl.vulkan.VkRect2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.nrenderArea(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer renderArea(java.util.function.Consumer<org.lwjgl.vulkan.VkRect2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkRect2D r1 = r1.renderArea()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.nlayerCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.nviewMask(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.npColorAttachments(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pDepthAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.npDepthAttachment(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderingInfo.Buffer pStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingInfo.npStencilAttachment(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderingInfo r0 = org.lwjgl.vulkan.VkRenderingInfo.create(r0)
                org.lwjgl.vulkan.VkRenderingInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderingInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderingInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderingInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkRenderingFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRect2D renderArea() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRect2D r0 = nrenderArea(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int layerCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nlayerCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int viewMask() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nviewMask(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int colorAttachmentCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncolorAttachmentCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *")
    public org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer pColorAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = npColorAttachments(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *")
    public org.lwjgl.vulkan.VkRenderingAttachmentInfo pDepthAttachment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = npDepthAttachment(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *")
    public org.lwjgl.vulkan.VkRenderingAttachmentInfo pStencilAttachment() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = npStencilAttachment(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000044000(0x3b9b75e0, float:0.0047442764)
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkMultisampledRenderToSingleSampledInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkMultisampledRenderToSingleSampledInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkMultiviewPerViewAttributesInfoNVX r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkRenderingFragmentDensityMapAttachmentInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderingFragmentDensityMapAttachmentInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pNext(org.lwjgl.vulkan.VkRenderingFragmentShadingRateAttachmentInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderingFragmentShadingRateAttachmentInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo flags(@org.lwjgl.system.NativeType("VkRenderingFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo renderArea(org.lwjgl.vulkan.VkRect2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrenderArea(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo renderArea(java.util.function.Consumer<org.lwjgl.vulkan.VkRect2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkRect2D r1 = r1.renderArea()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo layerCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nlayerCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewMask(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorAttachments(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pDepthAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDepthAttachment(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo pStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkRenderingAttachmentInfo const *") org.lwjgl.vulkan.VkRenderingAttachmentInfo r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npStencilAttachment(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo set(int r5, long r6, int r8, org.lwjgl.vulkan.VkRect2D r9, int r10, int r11, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r12, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.renderArea(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.layerCount(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.viewMask(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pColorAttachments(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pDepthAttachment(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.pStencilAttachment(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingInfo set(org.lwjgl.vulkan.VkRenderingInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo malloc() {
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo calloc() {
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo create() {
            int r0 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo create(long r6) {
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
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

    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderingInfo r0 = new org.lwjgl.vulkan.VkRenderingInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderingInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkRect2D nrenderArea(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.RENDERAREA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkRect2D r0 = org.lwjgl.vulkan.VkRect2D.create(r0)
            return r0
    }

    public static int nlayerCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nviewMask(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.VIEWMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int ncolorAttachmentCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.COLORATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer npColorAttachments(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PCOLORATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncolorAttachmentCount(r1)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo$Buffer r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.createSafe(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo npDepthAttachment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PDEPTHATTACHMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.createSafe(r0)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfo npStencilAttachment(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PSTENCILATTACHMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            org.lwjgl.vulkan.VkRenderingAttachmentInfo r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfo.createSafe(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nrenderArea(long r7, org.lwjgl.vulkan.VkRect2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkRenderingInfo.RENDERAREA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkRect2D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nlayerCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.LAYERCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nviewMask(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.VIEWMASK
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void ncolorAttachmentCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderingInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.COLORATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npColorAttachments(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PCOLORATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            if (r1 != 0) goto L16
            r1 = 0
            goto L1a
        L16:
            r1 = r7
            int r1 = r1.remaining()
        L1a:
            ncolorAttachmentCount(r0, r1)
            return
    }

    public static void npDepthAttachment(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PDEPTHATTACHMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void npStencilAttachment(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkRenderingAttachmentInfo r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PSTENCILATTACHMENT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void validate(long r5) {
            r0 = r5
            int r0 = ncolorAttachmentCount(r0)
            if (r0 == 0) goto L14
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderingInfo.PCOLORATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderingInfo r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 10
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            int r3 = org.lwjgl.vulkan.VkRect2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkRect2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            int r3 = org.lwjgl.vulkan.VkRenderingInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkRenderingInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRenderingInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.FLAGS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.RENDERAREA = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.LAYERCOUNT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.VIEWMASK = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.COLORATTACHMENTCOUNT = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.PCOLORATTACHMENTS = r0
            r0 = r6
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.PDEPTHATTACHMENT = r0
            r0 = r6
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderingInfo.PSTENCILATTACHMENT = r0
            return
    }
}
