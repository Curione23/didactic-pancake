package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR.class */
public class VkSubpassDescription2KHR extends org.lwjgl.vulkan.VkSubpassDescription2 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkSubpassDescription2KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkSubpassDescription2.Buffer {
        private static final org.lwjgl.vulkan.VkSubpassDescription2KHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkSubpassDescription2KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000109002(0x3b9c73ca, float:0.0047745453)
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer flags(@org.lwjgl.system.NativeType("VkSubpassDescriptionFlags") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.nflags(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npipelineBindPoint(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.nviewMask(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pInputAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npInputAttachments(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.ncolorAttachmentCount(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npColorAttachments(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pResolveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npResolveAttachments(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pDepthStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2 r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npDepthStencilAttachment(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer pPreserveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR.npPreserveAttachments(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pPreserveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pPreserveAttachments(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pDepthStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2 r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pDepthStencilAttachment(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pResolveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pResolveAttachments(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pColorAttachments(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.colorAttachmentCount(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pInputAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pInputAttachments(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer viewMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.viewMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pipelineBindPoint(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer flags(@org.lwjgl.system.NativeType("VkSubpassDescriptionFlags") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.flags(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkSubpassDescription2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = org.lwjgl.vulkan.VkSubpassDescription2KHR.create(r0)
                org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkSubpassDescription2KHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkSubpassDescription2KHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkSubpassDescription2KHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000109002(0x3b9c73ca, float:0.0047745453)
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR flags(@org.lwjgl.system.NativeType("VkSubpassDescriptionFlags") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nflags(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npipelineBindPoint(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR viewMask(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nviewMask(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pInputAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npInputAttachments(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ncolorAttachmentCount(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npColorAttachments(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pResolveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npResolveAttachments(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pDepthStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2 r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npDepthStencilAttachment(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR pPreserveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            npPreserveAttachments(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public org.lwjgl.vulkan.VkSubpassDescription2KHR set(int r5, long r6, int r8, int r9, int r10, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2.Buffer r11, int r12, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2.Buffer r13, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2.Buffer r14, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2 r15, @javax.annotation.Nullable java.nio.IntBuffer r16) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.flags(r1)
            r0 = r4
            r1 = r9
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pipelineBindPoint(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.viewMask(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pInputAttachments(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.colorAttachmentCount(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pColorAttachments(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pResolveAttachments(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pDepthStencilAttachment(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pPreserveAttachments(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkSubpassDescription2KHR set(org.lwjgl.vulkan.VkSubpassDescription2KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR malloc() {
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR calloc() {
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR create() {
            int r0 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR create(long r6) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
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

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR mallocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR callocStack() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR mallocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = malloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR callocStack(org.lwjgl.system.MemoryStack r2) {
            r0 = r2
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = calloc(r0)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer mallocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer callocStack(int r3) {
            r0 = r3
            org.lwjgl.system.MemoryStack r1 = org.lwjgl.system.MemoryStack.stackGet()
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer mallocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = malloc(r0, r1)
            return r0
    }

    @java.lang.Deprecated
    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer callocStack(int r3, org.lwjgl.system.MemoryStack r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = calloc(r0, r1)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkSubpassDescription2KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer r0 = new org.lwjgl.vulkan.VkSubpassDescription2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkSubpassDescription2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkSubpassDescription2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 set(int r15, long r16, int r18, int r19, int r20, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2.Buffer r21, int r22, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2.Buffer r23, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2.Buffer r24, @javax.annotation.Nullable org.lwjgl.vulkan.VkAttachmentReference2 r25, @javax.annotation.Nullable java.nio.IntBuffer r26) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pPreserveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("uint32_t const *") java.nio.IntBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pPreserveAttachments(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pDepthStencilAttachment(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2 r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pDepthStencilAttachment(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pResolveAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pResolveAttachments(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pColorAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pColorAttachments(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 colorAttachmentCount(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.colorAttachmentCount(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pInputAttachments(@javax.annotation.Nullable @org.lwjgl.system.NativeType("VkAttachmentReference2 const *") org.lwjgl.vulkan.VkAttachmentReference2.Buffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pInputAttachments(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 viewMask(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.viewMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pipelineBindPoint(@org.lwjgl.system.NativeType("VkPipelineBindPoint") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pipelineBindPoint(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 flags(@org.lwjgl.system.NativeType("VkSubpassDescriptionFlags") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.flags(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkSubpassDescription2 create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkSubpassDescription2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkSubpassDescription2KHR r0 = r0.create(r1, r2)
            return r0
    }
}
