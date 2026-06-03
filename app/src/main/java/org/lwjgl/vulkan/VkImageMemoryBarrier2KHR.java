package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR.class */
public class VkImageMemoryBarrier2KHR extends org.lwjgl.vulkan.VkImageMemoryBarrier2 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkImageMemoryBarrier2KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer {
        private static final org.lwjgl.vulkan.VkImageMemoryBarrier2KHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkImageMemoryBarrier2KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000314002(0x3b9f9492, float:0.004870006)
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer srcStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nsrcStageMask(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nsrcAccessMask(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer dstStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ndstStageMask(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ndstAccessMask(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.noldLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nnewLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer srcQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nsrcQueueFamilyIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer dstQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ndstQueueFamilyIndex(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer image(@org.lwjgl.system.NativeType("VkImage") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nimage(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.nsubresourceRange(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer subresourceRange(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.subresourceRange(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.subresourceRange(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer image(@org.lwjgl.system.NativeType("VkImage") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.image(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer dstQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.dstQueueFamilyIndex(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer srcQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.srcQueueFamilyIndex(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.newLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.oldLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.dstAccessMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer dstStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.dstStageMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.srcAccessMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer srcStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.srcStageMask(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.create(r0)
                org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkImageMemoryBarrier2KHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkImageMemoryBarrier2KHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkImageMemoryBarrier2KHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000314002(0x3b9f9492, float:0.004870006)
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR srcStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcStageMask(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nsrcAccessMask(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR dstStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstStageMask(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            ndstAccessMask(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            noldLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nnewLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR srcQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsrcQueueFamilyIndex(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR dstQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            ndstQueueFamilyIndex(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR image(@org.lwjgl.system.NativeType("VkImage") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nimage(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsubresourceRange(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR subresourceRange(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceRange> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceRange r1 = r1.subresourceRange()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR set(int r5, long r6, long r8, long r10, long r12, long r14, int r16, int r17, int r18, int r19, long r20, org.lwjgl.vulkan.VkImageSubresourceRange r22) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.srcStageMask(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.srcAccessMask(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.dstStageMask(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.dstAccessMask(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.oldLayout(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.newLayout(r1)
            r0 = r4
            r1 = r18
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.srcQueueFamilyIndex(r1)
            r0 = r4
            r1 = r19
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.dstQueueFamilyIndex(r1)
            r0 = r4
            r1 = r20
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.image(r1)
            r0 = r4
            r1 = r22
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.subresourceRange(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkImageMemoryBarrier2KHR set(org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR malloc() {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR calloc() {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR create() {
            int r0 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR create(long r6) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
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

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer r0 = new org.lwjgl.vulkan.VkImageMemoryBarrier2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkImageMemoryBarrier2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 set(int r21, long r22, long r24, long r26, long r28, long r30, int r32, int r33, int r34, int r35, long r36, org.lwjgl.vulkan.VkImageSubresourceRange r38) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            r4 = r26
            r5 = r28
            r6 = r30
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r38
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 subresourceRange(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.subresourceRange(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 subresourceRange(org.lwjgl.vulkan.VkImageSubresourceRange r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.subresourceRange(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 image(@org.lwjgl.system.NativeType("VkImage") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.image(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 dstQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.dstQueueFamilyIndex(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 srcQueueFamilyIndex(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.srcQueueFamilyIndex(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 newLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.newLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 oldLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.oldLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 dstAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.dstAccessMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 dstStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.dstStageMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 srcAccessMask(@org.lwjgl.system.NativeType("VkAccessFlags2") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.srcAccessMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 srcStageMask(@org.lwjgl.system.NativeType("VkPipelineStageFlags2") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.srcStageMask(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkImageMemoryBarrier2 create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkImageMemoryBarrier2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkImageMemoryBarrier2KHR r0 = r0.create(r1, r2)
            return r0
    }
}
