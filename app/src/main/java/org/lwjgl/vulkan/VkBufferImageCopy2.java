package org.lwjgl.vulkan;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2.class */
public class VkBufferImageCopy2 extends org.lwjgl.system.Struct<org.lwjgl.vulkan.VkBufferImageCopy2> implements org.lwjgl.system.NativeResource {
    public static final int SIZEOF = 0;
    public static final int ALIGNOF = 0;
    public static final int STYPE = 0;
    public static final int PNEXT = 0;
    public static final int BUFFEROFFSET = 0;
    public static final int BUFFERROWLENGTH = 0;
    public static final int BUFFERIMAGEHEIGHT = 0;
    public static final int IMAGESUBRESOURCE = 0;
    public static final int IMAGEOFFSET = 0;
    public static final int IMAGEEXTENT = 0;

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2$Buffer.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2$Buffer.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/vulkan/VkBufferImageCopy2$Buffer.class */
    public static class Buffer extends org.lwjgl.system.StructBuffer<org.lwjgl.vulkan.VkBufferImageCopy2, org.lwjgl.vulkan.VkBufferImageCopy2.Buffer> implements org.lwjgl.system.NativeResource {
        private static final org.lwjgl.vulkan.VkBufferImageCopy2 ELEMENT_FACTORY = null;

        public Buffer(java.nio.ByteBuffer r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r6
                int r2 = r2.remaining()
                int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
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
        protected org.lwjgl.vulkan.VkBufferImageCopy2.Buffer self() {
                r2 = this;
                r0 = r2
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected org.lwjgl.vulkan.VkBufferImageCopy2 getElementFactory() {
                r2 = this;
                org.lwjgl.vulkan.VkBufferImageCopy2 r0 = org.lwjgl.vulkan.VkBufferImageCopy2.Buffer.ELEMENT_FACTORY
                return r0
        }

        @org.lwjgl.system.NativeType("VkStructureType")
        public int sType() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nsType(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("void const *")
        public long pNext() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkBufferImageCopy2.npNext(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("VkDeviceSize")
        public long bufferOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                long r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nbufferOffset(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferRowLength() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nbufferRowLength(r0)
                return r0
        }

        @org.lwjgl.system.NativeType("uint32_t")
        public int bufferImageHeight() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                int r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nbufferImageHeight(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkImageSubresourceLayers imageSubresource() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nimageSubresource(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkOffset3D imageOffset() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nimageOffset(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkExtent3D imageExtent() {
                r3 = this;
                r0 = r3
                long r0 = r0.address()
                org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkBufferImageCopy2.nimageExtent(r0)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2.nsType(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer sType$Default() {
                r3 = this;
                r0 = r3
                r1 = 1000337009(0x3b9fee71, float:0.0048807194)
                org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = r0.sType(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferImageCopy2.npNext(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer pNext(org.lwjgl.vulkan.VkCopyCommandTransformInfoQCOM r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r5
                long r2 = r2.pNext()
                org.lwjgl.vulkan.VkCopyCommandTransformInfoQCOM r1 = r1.pNext(r2)
                long r1 = r1.address()
                org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = r0.pNext(r1)
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer bufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
                r5 = this;
                r0 = r5
                long r0 = r0.address()
                r1 = r6
                org.lwjgl.vulkan.VkBufferImageCopy2.nbufferOffset(r0, r1)
                r0 = r5
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2.nbufferRowLength(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2.nbufferImageHeight(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2.nimageSubresource(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2.nimageOffset(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
                r4 = this;
                r0 = r4
                long r0 = r0.address()
                r1 = r5
                org.lwjgl.vulkan.VkBufferImageCopy2.nimageExtent(r0, r1)
                r0 = r4
                return r0
        }

        public org.lwjgl.vulkan.VkBufferImageCopy2.Buffer imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
                r3 = this;
                r0 = r4
                r1 = r3
                org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
                r0.accept(r1)
                r0 = r3
                return r0
        }

        @Override // org.lwjgl.system.StructBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct getElementFactory() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.getElementFactory()
                return r0
        }

        @Override // org.lwjgl.system.CustomBuffer
        protected /* bridge */ /* synthetic */ org.lwjgl.system.CustomBuffer self() {
                r2 = this;
                r0 = r2
                org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = r0.self()
                return r0
        }

        static {
                r0 = -1
                org.lwjgl.vulkan.VkBufferImageCopy2 r0 = org.lwjgl.vulkan.VkBufferImageCopy2.create(r0)
                org.lwjgl.vulkan.VkBufferImageCopy2.Buffer.ELEMENT_FACTORY = r0
                return
        }
    }

    protected VkBufferImageCopy2(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected org.lwjgl.vulkan.VkBufferImageCopy2 create(long r7, @javax.annotation.Nullable java.nio.ByteBuffer r9) {
            r6 = this;
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = r7
            r3 = r9
            r1.<init>(r2, r3)
            return r0
    }

    public VkBufferImageCopy2(java.nio.ByteBuffer r7) {
            r6 = this;
            r0 = r6
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            java.nio.ByteBuffer r2 = __checkContainer(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    public int sizeof() {
            r2 = this;
            int r0 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
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

    @org.lwjgl.system.NativeType("VkDeviceSize")
    public long bufferOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            long r0 = nbufferOffset(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bufferRowLength() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferRowLength(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("uint32_t")
    public int bufferImageHeight() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            int r0 = nbufferImageHeight(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkImageSubresourceLayers imageSubresource() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = nimageSubresource(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkOffset3D imageOffset() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkOffset3D r0 = nimageOffset(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkExtent3D imageExtent() {
            r3 = this;
            r0 = r3
            long r0 = r0.address()
            org.lwjgl.vulkan.VkExtent3D r0 = nimageExtent(r0)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 sType(@org.lwjgl.system.NativeType("VkStructureType") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nsType(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 sType$Default() {
            r3 = this;
            r0 = r3
            r1 = 1000337009(0x3b9fee71, float:0.0048807194)
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.sType(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 pNext(@org.lwjgl.system.NativeType("void const *") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            npNext(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 pNext(org.lwjgl.vulkan.VkCopyCommandTransformInfoQCOM r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r5
            long r2 = r2.pNext()
            org.lwjgl.vulkan.VkCopyCommandTransformInfoQCOM r1 = r1.pNext(r2)
            long r1 = r1.address()
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.pNext(r1)
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 bufferOffset(@org.lwjgl.system.NativeType("VkDeviceSize") long r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.address()
            r1 = r6
            nbufferOffset(r0, r1)
            r0 = r5
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 bufferRowLength(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferRowLength(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 bufferImageHeight(@org.lwjgl.system.NativeType("uint32_t") int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nbufferImageHeight(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 imageSubresource(org.lwjgl.vulkan.VkImageSubresourceLayers r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageSubresource(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 imageSubresource(java.util.function.Consumer<org.lwjgl.vulkan.VkImageSubresourceLayers> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkImageSubresourceLayers r1 = r1.imageSubresource()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 imageOffset(org.lwjgl.vulkan.VkOffset3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageOffset(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 imageOffset(java.util.function.Consumer<org.lwjgl.vulkan.VkOffset3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkOffset3D r1 = r1.imageOffset()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 imageExtent(org.lwjgl.vulkan.VkExtent3D r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.address()
            r1 = r5
            nimageExtent(r0, r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 imageExtent(java.util.function.Consumer<org.lwjgl.vulkan.VkExtent3D> r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            org.lwjgl.vulkan.VkExtent3D r1 = r1.imageExtent()
            r0.accept(r1)
            r0 = r3
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 set(int r5, long r6, long r8, int r10, int r11, org.lwjgl.vulkan.VkImageSubresourceLayers r12, org.lwjgl.vulkan.VkOffset3D r13, org.lwjgl.vulkan.VkExtent3D r14) {
            r4 = this;
            r0 = r4
            r1 = r5
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.sType(r1)
            r0 = r4
            r1 = r6
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.pNext(r1)
            r0 = r4
            r1 = r8
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.bufferOffset(r1)
            r0 = r4
            r1 = r10
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.bufferRowLength(r1)
            r0 = r4
            r1 = r11
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.bufferImageHeight(r1)
            r0 = r4
            r1 = r12
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.imageSubresource(r1)
            r0 = r4
            r1 = r13
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.imageOffset(r1)
            r0 = r4
            r1 = r14
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.imageExtent(r1)
            r0 = r4
            return r0
    }

    public org.lwjgl.vulkan.VkBufferImageCopy2 set(org.lwjgl.vulkan.VkBufferImageCopy2 r8) {
            r7 = this;
            r0 = r8
            long r0 = r0.address()
            r1 = r7
            long r1 = r1.address()
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            r0 = r7
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2 malloc() {
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r2 = (long) r2
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2 calloc() {
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = 1
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2 create() {
            int r0 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            java.nio.ByteBuffer r0 = org.lwjgl.BufferUtils.createByteBuffer(r0)
            r6 = r0
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2 create(long r6) {
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferImageCopy2 createSafe(long r6) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = r6
            r3 = 0
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer malloc(int r6) {
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r2 = __checkMalloc(r2, r3)
            long r2 = org.lwjgl.system.MemoryUtil.nmemAllocChecked(r2)
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer calloc(int r7) {
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
            r1 = r0
            r2 = r7
            long r2 = (long) r2
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r3 = (long) r3
            long r2 = org.lwjgl.system.MemoryUtil.nmemCallocChecked(r2, r3)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer create(int r10) {
            r0 = r10
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            java.nio.ByteBuffer r0 = __create(r0, r1)
            r11 = r0
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
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

    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer create(long r6, int r8) {
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer createSafe(long r6, int r8) {
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            r0 = 0
            goto L13
        La:
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
        L13:
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2 malloc(org.lwjgl.system.MemoryStack r6) {
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = r6
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.ALIGNOF
            int r4 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r2 = r2.nmalloc(r3, r4)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2 calloc(org.lwjgl.system.MemoryStack r7) {
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = new org.lwjgl.vulkan.VkBufferImageCopy2
            r1 = r0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.ALIGNOF
            r4 = 1
            int r5 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer malloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            int r4 = r4 * r5
            long r2 = r2.nmalloc(r3, r4)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.vulkan.VkBufferImageCopy2.Buffer calloc(int r7, org.lwjgl.system.MemoryStack r8) {
            org.lwjgl.vulkan.VkBufferImageCopy2$Buffer r0 = new org.lwjgl.vulkan.VkBufferImageCopy2$Buffer
            r1 = r0
            r2 = r8
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.ALIGNOF
            r4 = r7
            int r5 = org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF
            long r2 = r2.ncalloc(r3, r4, r5)
            r3 = r7
            r1.<init>(r2, r3)
            return r0
    }

    public static int nsType(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static long npNext(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            long r0 = org.lwjgl.system.MemoryUtil.memGetAddress(r0)
            return r0
    }

    public static long nbufferOffset(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.BUFFEROFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            long r0 = r0.getLong(r1, r2)
            return r0
    }

    public static int nbufferRowLength(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERROWLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static int nbufferImageHeight(long r7) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERIMAGEHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            int r0 = r0.getInt(r1, r2)
            return r0
    }

    public static org.lwjgl.vulkan.VkImageSubresourceLayers nimageSubresource(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2.IMAGESUBRESOURCE
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkImageSubresourceLayers r0 = org.lwjgl.vulkan.VkImageSubresourceLayers.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkOffset3D nimageOffset(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEOFFSET
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkOffset3D r0 = org.lwjgl.vulkan.VkOffset3D.create(r0)
            return r0
    }

    public static org.lwjgl.vulkan.VkExtent3D nimageExtent(long r5) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEEXTENT
            long r1 = (long) r1
            long r0 = r0 + r1
            org.lwjgl.vulkan.VkExtent3D r0 = org.lwjgl.vulkan.VkExtent3D.create(r0)
            return r0
    }

    public static void nsType(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.STYPE
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void npNext(long r5, long r7) {
            r0 = r5
            int r1 = org.lwjgl.vulkan.VkBufferImageCopy2.PNEXT
            long r1 = (long) r1
            long r0 = r0 + r1
            r1 = r7
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)
            return
    }

    public static void nbufferOffset(long r7, long r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.BUFFEROFFSET
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putLong(r1, r2, r3)
            return
    }

    public static void nbufferRowLength(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERROWLENGTH
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nbufferImageHeight(long r7, int r9) {
            sun.misc.Unsafe r0 = org.lwjgl.vulkan.VkBufferImageCopy2.UNSAFE
            r1 = 0
            r2 = r7
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERIMAGEHEIGHT
            long r3 = (long) r3
            long r2 = r2 + r3
            r3 = r9
            r0.putInt(r1, r2, r3)
            return
    }

    public static void nimageSubresource(long r7, org.lwjgl.vulkan.VkImageSubresourceLayers r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2.IMAGESUBRESOURCE
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nimageOffset(long r7, org.lwjgl.vulkan.VkOffset3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEOFFSET
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    public static void nimageExtent(long r7, org.lwjgl.vulkan.VkExtent3D r9) {
            r0 = r9
            long r0 = r0.address()
            r1 = r7
            int r2 = org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEEXTENT
            long r2 = (long) r2
            long r1 = r1 + r2
            int r2 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            long r2 = (long) r2
            org.lwjgl.system.MemoryUtil.memCopy(r0, r1, r2)
            return
    }

    @Override // org.lwjgl.system.Struct
    protected /* bridge */ /* synthetic */ org.lwjgl.system.Struct create(long r6, @javax.annotation.Nullable java.nio.ByteBuffer r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.vulkan.VkBufferImageCopy2 r0 = r0.create(r1, r2)
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
            int r3 = org.lwjgl.vulkan.VkBufferImageCopy2.POINTER_SIZE
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
            r3 = 4
            org.lwjgl.system.Struct$Member r3 = __member(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            int r3 = org.lwjgl.vulkan.VkImageSubresourceLayers.SIZEOF
            int r4 = org.lwjgl.vulkan.VkImageSubresourceLayers.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            int r3 = org.lwjgl.vulkan.VkOffset3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkOffset3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 7
            int r3 = org.lwjgl.vulkan.VkExtent3D.SIZEOF
            int r4 = org.lwjgl.vulkan.VkExtent3D.ALIGNOF
            org.lwjgl.system.Struct$Member r3 = __member(r3, r4)
            r1[r2] = r3
            org.lwjgl.system.Struct$Layout r0 = __struct(r0)
            r6 = r0
            r0 = r6
            int r0 = r0.getSize()
            org.lwjgl.vulkan.VkBufferImageCopy2.SIZEOF = r0
            r0 = r6
            int r0 = r0.getAlignment()
            org.lwjgl.vulkan.VkBufferImageCopy2.ALIGNOF = r0
            r0 = r6
            r1 = 0
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.STYPE = r0
            r0 = r6
            r1 = 1
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.PNEXT = r0
            r0 = r6
            r1 = 2
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.BUFFEROFFSET = r0
            r0 = r6
            r1 = 3
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERROWLENGTH = r0
            r0 = r6
            r1 = 4
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.BUFFERIMAGEHEIGHT = r0
            r0 = r6
            r1 = 5
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.IMAGESUBRESOURCE = r0
            r0 = r6
            r1 = 6
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEOFFSET = r0
            r0 = r6
            r1 = 7
            int r0 = r0.offsetof(r1)
            org.lwjgl.vulkan.VkBufferImageCopy2.IMAGEEXTENT = r0
            return
    }
}
