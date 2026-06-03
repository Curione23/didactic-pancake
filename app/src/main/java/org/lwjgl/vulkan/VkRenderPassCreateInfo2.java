package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2.class */
public class VkRenderPassCreateInfo2 extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkRenderPassCreateInfo2> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int FLAGS = 0;
    public static final int ATTACHMENTCOUNT = 0;
    public static final int PATTACHMENTS = 0;
    public static final int SUBPASSCOUNT = 0;
    public static final int PSUBPASSES = 0;
    public static final int DEPENDENCYCOUNT = 0;
    public static final int PDEPENDENCIES = 0;
    public static final int CORRELATEDVIEWMASKCOUNT = 0;
    public static final int PCORRELATEDVIEWMASKS = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderPassCreateInfo2$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkRenderPassCreateInfo2, org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkRenderPassCreateInfo2 ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
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
        protected org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderPassCreateInfo2 getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkRenderPassCreateFlags")
        public int flags() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.nflags(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int attachmentCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.nattachmentCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkAttachmentDescription2 const *")
        public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer pAttachments() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.npAttachments(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int subpassCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.nsubpassCount(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkSubpassDescription2 const *")
        public org.lwjgl.vulkan.VkSubpassDescription2.Buffer pSubpasses() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSubpassDescription2$Buffer r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.npSubpasses(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int dependencyCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ndependencyCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("VkSubpassDependency2 const *")
        public org.lwjgl.vulkan.VkSubpassDependency2.Buffer pDependencies() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkSubpassDependency2$Buffer r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.npDependencies(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int correlatedViewMaskCount() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ncorrelatedViewMaskCount(r0)
                return r0
        }

        @javax.annotation.Nullable
        @org.lwjgl.system.NativeType("uint32_t const *")
        public java.nio.IntBuffer pCorrelatedViewMasks() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                java.nio.IntBuffer r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.npCorrelatedViewMasks(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000109004(0x3b9c73cc, float:0.0047745463)
                org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pNext(org.lwjgl.vulkan.VkRenderPassCreationControlEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassCreationControlEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pNext(org.lwjgl.vulkan.VkRenderPassCreationFeedbackCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pNext(org.lwjgl.vulkan.VkRenderPassFragmentDensityMapCreateInfoEXT r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkRenderPassFragmentDensityMapCreateInfoEXT r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer flags(@org.lwjgl.system.NativeType("VkRenderPassCreateFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.nflags(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentDescription2 const *") org.lwjgl.vulkan.VkAttachmentDescription2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.npAttachments(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pSubpasses(@org.lwjgl.system.NativeType("VkSubpassDescription2 const *") org.lwjgl.vulkan.VkSubpassDescription2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.npSubpasses(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pDependencies(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSubpassDependency2 const *") org.lwjgl.vulkan.VkSubpassDependency2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.npDependencies(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer pCorrelatedViewMasks(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.npCorrelatedViewMasks(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.create(r0)
                org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderPassCreateInfo2(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderPassCreateInfo2 create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderPassCreateInfo2(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
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

    @org.lwjgl.system.NativeType("VkRenderPassCreateFlags")
    public int flags() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nflags(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int attachmentCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nattachmentCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkAttachmentDescription2 const *")
    public org.lwjgl.vulkan.VkAttachmentDescription2.Buffer pAttachments() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = npAttachments(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int subpassCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nsubpassCount(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("VkSubpassDescription2 const *")
    public org.lwjgl.vulkan.VkSubpassDescription2.Buffer pSubpasses() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSubpassDescription2$Buffer r0 = npSubpasses(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int dependencyCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ndependencyCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("VkSubpassDependency2 const *")
    public org.lwjgl.vulkan.VkSubpassDependency2.Buffer pDependencies() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkSubpassDependency2$Buffer r0 = npDependencies(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int correlatedViewMaskCount() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = ncorrelatedViewMaskCount(r0)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("uint32_t const *")
    public java.nio.IntBuffer pCorrelatedViewMasks() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            java.nio.IntBuffer r0 = npCorrelatedViewMasks(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000109004(0x3b9c73cc, float:0.0047745463)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pNext(org.lwjgl.vulkan.VkRenderPassCreationControlEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassCreationControlEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pNext(org.lwjgl.vulkan.VkRenderPassCreationFeedbackCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassCreationFeedbackCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pNext(org.lwjgl.vulkan.VkRenderPassFragmentDensityMapCreateInfoEXT r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkRenderPassFragmentDensityMapCreateInfoEXT r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 flags(@org.lwjgl.system.NativeType("VkRenderPassCreateFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentDescription2 const *") org.lwjgl.vulkan.VkAttachmentDescription2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npAttachments(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pSubpasses(@org.lwjgl.system.NativeType("VkSubpassDescription2 const *") org.lwjgl.vulkan.VkSubpassDescription2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npSubpasses(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pDependencies(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkSubpassDependency2 const *") org.lwjgl.vulkan.VkSubpassDependency2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDependencies(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 pCorrelatedViewMasks(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npCorrelatedViewMasks(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 set(int r5, long r6, int r8, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentDescription2.Buffer r9, org.lwjgl.vulkan.VkSubpassDescription2.Buffer r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkSubpassDependency2.Buffer r11, @javax.annotation.Nullable java.nio.IntBuffer r12) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pAttachments(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pSubpasses(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pDependencies(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.pCorrelatedViewMasks(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderPassCreateInfo2 set(org.lwjgl.vulkan.VkRenderPassCreateInfo2 r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 malloc() {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 calloc() {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 create() {
            int r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 create(long r6) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
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

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2 calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderPassCreateInfo2.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer r0 = new org.lwjgl.vulkan.VkRenderPassCreateInfo2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static int nflags(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nattachmentCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkAttachmentDescription2.Buffer npAttachments(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nattachmentCount(r1)
            org.lwjgl.vulkan.VkAttachmentDescription2$Buffer r0 = org.lwjgl.vulkan.VkAttachmentDescription2.createSafe(r0, r1)
            return r0
    }

    public static int nsubpassCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SUBPASSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2.Buffer npSubpasses(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PSUBPASSES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = nsubpassCount(r1)
            org.lwjgl.vulkan.VkSubpassDescription2$Buffer r0 = org.lwjgl.vulkan.VkSubpassDescription2.create(r0, r1)
            return r0
    }

    public static int ndependencyCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.DEPENDENCYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDependency2.Buffer npDependencies(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PDEPENDENCIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ndependencyCount(r1)
            org.lwjgl.vulkan.VkSubpassDependency2$Buffer r0 = org.lwjgl.vulkan.VkSubpassDependency2.createSafe(r0, r1)
            return r0
    }

    public static int ncorrelatedViewMaskCount(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    public static java.nio.IntBuffer npCorrelatedViewMasks(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r1 = r5
            int r1 = ncorrelatedViewMaskCount(r1)
            java.nio.IntBuffer r0 = org.lwjgl.system.MemoryUtil.memIntBufferSafe(r0, r1)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nflags(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.FLAGS
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nattachmentCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.ATTACHMENTCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npAttachments(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentDescription2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PATTACHMENTS
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
            nattachmentCount(r0, r1)
            return
    }

    public static void nsubpassCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.SUBPASSCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npSubpasses(long r5, org.lwjgl.vulkan.VkSubpassDescription2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PSUBPASSES
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            long r1 = r1.address()
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            r0 = r5
            r1 = r7
            int r1 = r1.remaining()
            nsubpassCount(r0, r1)
            return
    }

    public static void ndependencyCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.DEPENDENCYCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npDependencies(long r5, @javax.annotation.Nullable org.lwjgl.vulkan.VkSubpassDependency2.Buffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PDEPENDENCIES
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
            ndependencyCount(r0, r1)
            return
    }

    public static void ncorrelatedViewMaskCount(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npCorrelatedViewMasks(long r5, @javax.annotation.Nullable java.nio.IntBuffer r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS
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
            ncorrelatedViewMaskCount(r0, r1)
            return
    }

    public static void validate(long r6) {
            r0 = r6
            int r0 = nattachmentCount(r0)
            if (r0 == 0) goto L14
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PATTACHMENTS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r6
            int r0 = nsubpassCount(r0)
            r8 = r0
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PSUBPASSES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            r9 = r0
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r2 = org.lwjgl.vulkan.VkSubpassDescription2.SIZEOF
            void r3 = org.lwjgl.vulkan.VkSubpassDescription2::validate
            validate(r0, r1, r2, r3)
            r0 = r6
            int r0 = ndependencyCount(r0)
            if (r0 == 0) goto L49
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PDEPENDENCIES
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L49:
            r0 = r6
            int r0 = ncorrelatedViewMaskCount(r0)
            if (r0 == 0) goto L5d
            r0 = r6
            int r1 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            long r0 = org.lwjgl.system.Checks.check(r0)
        L5d:
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderPassCreateInfo2 r0 = r0.create(r1, r2)
            return r0
    }

    static {
            r0 = 11
            org.lwjgl.system.Struct$Member[] r0 = new org.lwjgl.system.Struct.Member[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 8
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 9
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 10
            int r3 = org.lwjgl.vulkan.VkRenderPassCreateInfo2.POINTER_SIZE
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r5 = r0
            r0 = r5
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.SIZEOF = r0
            r0 = r5
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.ALIGNOF = r0
            r0 = r5
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.STYPE = r0
            r0 = r5
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.PNEXT = r0
            r0 = r5
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.FLAGS = r0
            r0 = r5
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.ATTACHMENTCOUNT = r0
            r0 = r5
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.PATTACHMENTS = r0
            r0 = r5
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.SUBPASSCOUNT = r0
            r0 = r5
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.PSUBPASSES = r0
            r0 = r5
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.DEPENDENCYCOUNT = r0
            r0 = r5
            r1 = 8
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.PDEPENDENCIES = r0
            r0 = r5
            r1 = 9
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.CORRELATEDVIEWMASKCOUNT = r0
            r0 = r5
            r1 = 10
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkRenderPassCreateInfo2.PCORRELATEDVIEWMASKS = r0
            return
    }
}
