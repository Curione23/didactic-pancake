package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR.class */
public class VkBufferImageCopy2KHR extends org.lwjgl.vulkan.VkBufferImageCopy2 {

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2KHR$Buffer.class */
    public static class Buffer extends org.lwjgl.vulkan.VkBufferImageCopy2.Buffer {
        private static final org.lwjgl.vulkan.VkBufferImageCopy2KHR ELEMENT_FACTORY = null;

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

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        protected org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkBufferImageCopy2KHR getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer.ELEMENT_FACTORY
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nsType(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000337009(0x3b9fee71, float:0.0048807194)
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.npNext(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer bufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nbufferOffset(r0, r1)
                r0 = r5
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nbufferRowLength(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nbufferImageHeight(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nimageSubresource(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nimageOffset(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.nimageExtent(r0, r1)
                r0 = r4
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageExtent(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.imageExtent(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageExtent(org.lwjgl.vulkan.VkExtent3D r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.imageExtent(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageOffset(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.imageOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageOffset(org.lwjgl.vulkan.VkOffset3D r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.imageOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageSubresource(java.util.function.Consumer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.imageSubresource(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.imageSubresource(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.bufferImageHeight(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.bufferRowLength(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer bufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.bufferOffset(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.pNext(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer sType$Default() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.sType$Default()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer
        public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.sType(r1)
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2.Buffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.self()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.vulkan.VkBufferImageCopy2.Buffer, org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.create(r0)
                org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkBufferImageCopy2KHR(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2, org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkBufferImageCopy2KHR create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkBufferImageCopy2KHR(java.nio.ByteBuffer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.<init>(r1)
            return
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000337009(0x3b9fee71, float:0.0048807194)
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR bufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbufferOffset(r0, r1)
            r0 = r5
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferRowLength(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferImageHeight(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageSubresource(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageOffset(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageExtent(r0, r1)
            r0 = r4
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public org.lwjgl.vulkan.VkBufferImageCopy2KHR set(int r5, long r6, long r8, int r10, int r11, org.lwjgl.vulkan.VkImageSubresourceLayers r12, org.lwjgl.vulkan.VkOffset3D r13, org.lwjgl.vulkan.VkExtent3D r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.bufferOffset(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.bufferRowLength(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.bufferImageHeight(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageSubresource(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageOffset(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageExtent(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2KHR set(org.lwjgl.vulkan.VkBufferImageCopy2KHR r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR malloc() {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR calloc() {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR create() {
            int r0 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR create(long r6) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
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

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2KHR.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2KHR$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferImageCopy2KHR.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 set(int r13, long r14, long r16, int r18, int r19, org.lwjgl.vulkan.VkImageSubresourceLayers r20, org.lwjgl.vulkan.VkOffset3D r21, org.lwjgl.vulkan.VkExtent3D r22) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.set(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 imageExtent(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageExtent(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 imageExtent(org.lwjgl.vulkan.VkExtent3D r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageExtent(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 imageOffset(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 imageOffset(org.lwjgl.vulkan.VkOffset3D r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 imageSubresource(java.util.function.Consumer r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageSubresource(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.imageSubresource(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.bufferImageHeight(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.bufferRowLength(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 bufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.bufferOffset(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 pNext(@org.lwjgl.system.NativeType("void const *") long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.pNext(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 sType$Default() {
            r2 = this;
            r0 = r2
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.sType$Default()
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2
    public /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.sType(r1)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.vulkan.VkBufferImageCopy2 create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.create(r1, r2)
            return r0
    }

    @Override // org.lwjgl.vulkan.VkBufferImageCopy2, org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBufferImageCopy2KHR r0 = r0.create(r1, r2)
            return r0
    }
}
