package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo.class */
public class VkRenderPassBeginInfo extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRenderPassBeginInfo> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int RENDERPASS = 0;
    public static final int FRAMEBUFFER = 0;
    public static final int RENDERAREA = 0;
    public static final int CLEARVALUECOUNT = 0;
    public static final int PCLEARVALUES = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassBeginInfo$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRenderPassBeginInfo, org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRenderPassBeginInfo ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
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
        protected org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderPassBeginInfo getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRenderPass")
        public long renderPass() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.nrenderPass(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkFramebuffer")
        public long framebuffer() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.nframebuffer(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRect2D renderArea() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkRect2D r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.nrenderArea(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int clearValueCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.nclearValueCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkClearValue const *")
        public org.lwjgl.vulkan.VkClearValue.Buffer pClearValues() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkClearValue$Buffer r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.npClearValues(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassBeginInfo.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 43
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderPassBeginInfo.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfoKHR r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfoKHR r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkRenderPassSampleLocationsBeginInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassSampleLocationsBeginInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pNext(org.lwjgl.vulkan.VkRenderPassTransformBeginInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassTransformBeginInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer renderPass(@org.lwjgl.system.NativeType("VkRenderPass") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderPassBeginInfo.nrenderPass(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer framebuffer(@org.lwjgl.system.NativeType("VkFramebuffer") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderPassBeginInfo.nframebuffer(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer renderArea(org.lwjgl.vulkan.VkRect2D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassBeginInfo.nrenderArea(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer renderArea(java.util.function.Consumer<org.lwjgl.vulkan.VkRect2D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkRect2D r1 = r1.renderArea()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer clearValueCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassBeginInfo.nclearValueCount(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer pClearValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkClearValue const *") org.lwjgl.vulkan.VkClearValue.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassBeginInfo.npClearValues(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.create(r0)
                org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderPassBeginInfo(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderPassBeginInfo create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderPassBeginInfo(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
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

    @org.lwjgl.system.NativeType("VkFramebuffer")
    public long framebuffer() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nframebuffer(r0)
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
    public int clearValueCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nclearValueCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkClearValue const *")
    public org.lwjgl.vulkan.VkClearValue.Buffer pClearValues() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = npClearValues(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 43
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkDeviceGroupRenderPassBeginInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfo r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfoKHR r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassAttachmentBeginInfoKHR r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkRenderPassSampleLocationsBeginInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassSampleLocationsBeginInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pNext(org.lwjgl.vulkan.VkRenderPassTransformBeginInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassTransformBeginInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo renderPass(@org.lwjgl.system.NativeType("VkRenderPass") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nrenderPass(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo framebuffer(@org.lwjgl.system.NativeType("VkFramebuffer") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nframebuffer(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo renderArea(org.lwjgl.vulkan.VkRect2D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nrenderArea(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo renderArea(java.util.function.Consumer<org.lwjgl.vulkan.VkRect2D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkRect2D r1 = r1.renderArea()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo clearValueCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclearValueCount(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo pClearValues(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkClearValue const *") org.lwjgl.vulkan.VkClearValue.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npClearValues(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo set(int r5, long r6, long r8, long r10, org.lwjgl.vulkan.VkRect2D r12, int r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkClearValue.Buffer r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.renderPass(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.framebuffer(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.renderArea(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.clearValueCount(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.pClearValues(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassBeginInfo set(org.lwjgl.vulkan.VkRenderPassBeginInfo r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo malloc() {
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo calloc() {
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo create() {
            int r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo create(long r6) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
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

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassBeginInfo.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassBeginInfo$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassBeginInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nrenderPass(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static long nframebuffer(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.FRAMEBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkRect2D nrenderArea(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERAREA
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkRect2D r0 = org.lwjgl.vulkan.VkRect2D.create(r0)
            return r0
    }

    public static int nclearValueCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.CLEARVALUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkClearValue.Buffer npClearValues(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassBeginInfo.PCLEARVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nclearValueCount(r1)
            org.lwjgl.vulkan.VkClearValue$Buffer r0 = org.lwjgl.vulkan.VkClearValue.createSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassBeginInfo.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nrenderPass(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERPASS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nframebuffer(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.FRAMEBUFFER
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nrenderArea(long r7, org.lwjgl.vulkan.VkRect2D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERAREA
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkRect2D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nclearValueCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassBeginInfo.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.CLEARVALUECOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npClearValues(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkClearValue.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassBeginInfo.PCLEARVALUES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r7
            if (r0 == 0) goto L19
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nclearValueCount(r0, r1)
        L19:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderPassBeginInfo r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 8
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkRect2D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkRect2D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkRenderPassBeginInfo.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkRenderPassBeginInfo.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRenderPassBeginInfo.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERPASS = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.FRAMEBUFFER = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.RENDERAREA = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.CLEARVALUECOUNT = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassBeginInfo.PCLEARVALUES = r0
            return
    }
}
