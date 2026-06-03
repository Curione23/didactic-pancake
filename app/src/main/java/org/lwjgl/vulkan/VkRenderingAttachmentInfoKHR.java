package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR.class */
public class VkRenderingAttachmentInfoKHR extends org.lwjgl.vulkan.VkRenderingAttachmentInfo {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkRenderingAttachmentInfoKHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer {
        private static final org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000044001(0x3b9b75e1, float:0.004744277)
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer imageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nimageView(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer imageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nimageLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer resolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nresolveMode(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer resolveImageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nresolveImageView(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer resolveImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nresolveImageLayout(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nloadOp(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nstoreOp(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer clearValue(org.lwjgl.vulkan.VkClearValue r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.nclearValue(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer clearValue(java.util.function.Consumer<org.lwjgl.vulkan.VkClearValue> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkClearValue r1 = r1.clearValue()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer clearValue(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.clearValue(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer clearValue(org.lwjgl.vulkan.VkClearValue r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.clearValue(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.storeOp(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.loadOp(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer resolveImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.resolveImageLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer resolveImageView(@org.lwjgl.system.NativeType("VkImageView") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.resolveImageView(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer resolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.resolveMode(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer imageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.imageLayout(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer imageView(@org.lwjgl.system.NativeType("VkImageView") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.imageView(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.create(r0)
                org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkRenderingAttachmentInfoKHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkRenderingAttachmentInfoKHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000044001(0x3b9b75e1, float:0.004744277)
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR imageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nimageView(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR imageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR resolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresolveMode(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR resolveImageView(@org.lwjgl.system.NativeType("VkImageView") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nresolveImageView(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR resolveImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nresolveImageLayout(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nloadOp(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nstoreOp(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR clearValue(org.lwjgl.vulkan.VkClearValue r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nclearValue(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR clearValue(java.util.function.Consumer<org.lwjgl.vulkan.VkClearValue> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkClearValue r1 = r1.clearValue()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR set(int r5, long r6, long r8, int r10, int r11, long r12, int r14, int r15, int r16, org.lwjgl.vulkan.VkClearValue r17) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.imageView(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.imageLayout(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.resolveMode(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.resolveImageView(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.resolveImageLayout(r1)
            r0 = r4
            r1 = r15
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.loadOp(r1)
            r0 = r4
            r1 = r16
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.storeOp(r1)
            r0 = r4
            r1 = r17
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.clearValue(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR set(org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR malloc() {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR calloc() {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR create() {
            int r0 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR create(long r6) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
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

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer r0 = new org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo set(int r16, long r17, long r19, int r21, int r22, long r23, int r25, int r26, int r27, org.lwjgl.vulkan.VkClearValue r28) {
            r15 = this;
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo clearValue(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.clearValue(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo clearValue(org.lwjgl.vulkan.VkClearValue r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.clearValue(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo storeOp(@org.lwjgl.system.NativeType("VkAttachmentStoreOp") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.storeOp(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo loadOp(@org.lwjgl.system.NativeType("VkAttachmentLoadOp") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.loadOp(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo resolveImageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.resolveImageLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo resolveImageView(@org.lwjgl.system.NativeType("VkImageView") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.resolveImageView(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo resolveMode(@org.lwjgl.system.NativeType("VkResolveModeFlagBits") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.resolveMode(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo imageLayout(@org.lwjgl.system.NativeType("VkImageLayout") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.imageLayout(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo imageView(@org.lwjgl.system.NativeType("VkImageView") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.imageView(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkRenderingAttachmentInfo create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkRenderingAttachmentInfo, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkRenderingAttachmentInfoKHR r0 = r0.create(r1, r2)
            return r0
    }
}
